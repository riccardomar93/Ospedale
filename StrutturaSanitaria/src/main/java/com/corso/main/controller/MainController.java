package com.corso.main.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.main.model.Dipendente;
import com.corso.main.model.Login;
import com.corso.main.model.Responsabile;
import com.corso.main.model.Ricovero;
import com.corso.main.service.DipendenteService;
import com.corso.main.service.LoginService;
import com.corso.main.service.ResponsabileService;
import com.corso.main.service.RicoveroService;

@Controller
public class MainController {

    private static String dataStatica;
    private static int id_repartoStatico;
    private static String repartoStatico;

    @Autowired
    RicoveroService r;

    @Autowired
    ResponsabileService rs2;

    @Autowired
    LoginService ls;

    @Autowired
    DipendenteService ds;

    @GetMapping("/inserimentoRicovero")
    public void inserisci(Model m, @RequestParam(name = "nome_paziente") String nome_paziente,
	    @RequestParam(name = "cognome_paziente") String cognome_paziente) {

	Responsabile r2 = rs2.findByIdReparto(id_repartoStatico);

	Ricovero ri = new Ricovero(nome_paziente, cognome_paziente, id_repartoStatico, dataStatica);

	r.saveAndFlush(ri);

//	m.addAttribute("nome_responsabile", r2.getNome());
//	m.addAttribute("cognome_responsabile", r2.getCognome());

//	m.addAttribute("nome_paziente", ri.getNome_paziente());
//	m.addAttribute("cognome_paziente", ri.getCognome_paziente());

//	m.addAttribute(dataStatica);
//	m.addAttribute(repartoStatico);
//
//	return "confermaRicovero";

    }

    @GetMapping("/controlloCredenziali")
    public void controlla(Model m, @RequestParam(name = "username") String username,
	    @RequestParam(name = "password") String password) {

	Login l = ls.findByUsernameAndPassword(username, password);

	if (l != null) {

//	    return "";
	    System.out.println("Accesso effettuato");

	} else
//	    return "";
	    System.out.println("Accesso negato");
    }

    @GetMapping("/ricercaDipAll")
    public void cercaAll(Model m) {

	ArrayList<Dipendente> d = (ArrayList) ds.findAll();

	System.out.println("Ho cercato.");
    }

    @GetMapping("/nuovoDipendente")
    public void nuovoDip(Model m, @RequestParam(name = "nome") String nome,
	    @RequestParam(name = "cognome") String cognome, @RequestParam(name = "stipendio") Double stipendio) {

	Dipendente d = new Dipendente(nome, cognome, stipendio);

	ds.saveAndFlush(d);
    }

    @GetMapping("/eliminaDipendente")
    public void eliminaDip(Model m, @RequestParam(name = "idDipendente") Integer idDipendente) {

	ds.deleteById(idDipendente);

    }

    @GetMapping("/modificaDipendente")
    public void modificaDip(Model m, @RequestParam(name = "idDipendente") Integer idDipendente,
	    @RequestParam(name = "nome") String nome, @RequestParam(name = "cognome") String cognome,
	    @RequestParam(name = "stipendio") Double stipendio) {

	Dipendente d = ds.findByIdDipendente(idDipendente);

	if (d != null) {

	    Dipendente d2 = new Dipendente(idDipendente, nome, cognome, stipendio);
	    ds.saveAndFlush(d2);

	} else
	    System.out.println("Il dipendente non esiste.");

    }

}
