package com.corso.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.main.model.Responsabile;
import com.corso.main.model.Ricovero;
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

}
