package com.corso.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.main.model.Analisi;
import com.corso.main.model.Responsabile;
import com.corso.main.service.AnalisiService;
import com.corso.main.service.ResponsabileService;



@Controller
public class MainController {

	
	
	
	@Autowired
	AnalisiService as;

	@Autowired
	ResponsabileService rep;
	
	private static String dataStatica="2020-01-02";
	
	@GetMapping("/inserimentoAnalisi")
	public String insAnalisi(Model m, @RequestParam(name="cod_ricetta") String idRicetta, @RequestParam (name="nome_paziente") String nome_paziente, 
		@RequestParam(name="cognome_paziente") String cognome_paziente) {
		
		Responsabile re= rep.findByIdReparto(3);
		
		String analisi=null;
		Analisi a2= as.findByIdRicetta(idRicetta);
		
		if(a2==null) {
			analisi="confermaAnalisi";
		Analisi a=new Analisi(idRicetta,nome_paziente,cognome_paziente,dataStatica);
		System.out.println(a.getIdRicetta());
		as.saveAndFlush(a);
		System.out.println("non c'e'");
			
		m.addAttribute("cod_ricetta",a.getIdRicetta());
		m.addAttribute("nome_paziente",a.getNome_paziente());
		m.addAttribute("cognome_paziente",a.getCognome_paziente());
		m.addAttribute("nome_responsabile", re.getNome());
		m.addAttribute("cognome_responsabile", re.getCognome());
		m.addAttribute(dataStatica);
		
		
		
		return analisi;
	}
		else {
				System.out.println("ricetta c'e");
			analisi="analisiNo";
			return analisi;
	}
	}
	
	//@GetMapping("/verificaRicetta")
//	public boolean verificaRicetta (Model m, @RequestParam(name="cod_ricetta") String idRicetta) {
		
		
		//StringValueExp ricetta=Query.value("SELECT id_ricetta from Analisi");
		//if(id_ricetta==ricetta)
			//return false;
		//return "/AnalisiNo";
		
	}
	


	
	
	

