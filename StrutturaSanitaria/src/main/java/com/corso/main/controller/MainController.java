package com.corso.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.main.model.Ricovero;
import com.corso.main.service.RicoveroService;

@Controller
public class MainController {

    private static String dataStatica;
    private static String repartoStatico;

    @Autowired
    RicoveroService r;

    @GetMapping("/inserimentoRicovero")
    public String inserisci(Model m, @RequestParam(name = "nome_paziente") String nome_paziente,
	    @RequestParam(name = "cognome_paziente") String cognome_paziente) {

	Ricovero ri = new Ricovero(nome_paziente, cognome_paziente);

	r.saveAndFlush(ri);

	m.addAttribute(nome_paziente);
	m.addAttribute(cognome_paziente);

	return "confermaRicovero";

    }

}
