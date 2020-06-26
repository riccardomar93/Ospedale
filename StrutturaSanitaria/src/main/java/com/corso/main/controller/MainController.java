package com.corso.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.main.model.Analisi;
import com.corso.main.service.AnalisiService;



@Controller
public class MainController {

	
	
	
	@Autowired
	AnalisiService as;
	
	private static String dataStatica;
	
	@GetMapping("/inserimentoAnalisi")
	public String insAnalisi(Model m, @RequestParam(name="cod_ricetta") String id_ricetta, @RequestParam (name="nome_paziente") String nome_paziente, 
		@RequestParam(name="cognome_paziente") String cognome_paziente) {
		
		Analisi a=new Analisi(id_ricetta,nome_paziente,cognome_paziente);
		as.saveAndFlush(a);
		m.addAttribute(id_ricetta);
		m.addAttribute(nome_paziente);
		m.addAttribute(cognome_paziente);
		
		return "confermaAnalisi";
	}
	
//	@GetMapping("/inserimentoAnalisi")
//	public String insAnalisi(Model m, @RequestParam(name="cod_ricetta") String id_ricetta, @RequestParam (name="nome_paziente") String nome_paziente, 
//			@RequestParam(name="cognome_paziente") String cognome_paziente) {
//		//controllare se su data serve annotation
//		
//		System.out.println("qui");
//		Analisi a=new Analisi(id_ricetta,nome_paziente,cognome_paziente);
//		
//		as.saveAndFlush(a);
//		
//		System.out.println("dopo save");
//		
//		m.addAttribute(id_ricetta);
//		m.addAttribute(nome_paziente);
//		m.addAttribute(cognome_paziente);
//		m.addAttribute(dataStatica);
//		
//		return "confermaAnalisi";
//	}
	
	

	
	
	
}
