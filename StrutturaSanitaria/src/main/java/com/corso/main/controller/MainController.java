package com.corso.main.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.RequestScope;

import com.corso.main.service.AnalisiService;
import com.corso.main.service.RepartoService;

@Controller("/")
public class MainController {
	
	@Autowired
	AnalisiService an;
	@Autowired
	RepartoService rep;
	
	
	private static String dataStatica;
	

	@GetMapping("/maplabo")
	
	public String postiLab(Model emme, @RequestParam (name = "data") String dataRicerca )
	{
		
		// qui devo passare dataRicerca
		 dataStatica = 	dataRicerca;	
		 		 
		
		 int freeSides = an.postiLabo(dataRicerca);
		// int freeSides1 = an.postiLabo(emme.getAttribute(data));
		 
		 
		 
		// in questo caso il passaggio di emme di attributi non serve
		// emme.addAttribute("letti", freeSides);
		
		if (freeSides > 0) {
		
			return "analisiOk";
			
		} 
		else
			
			return "analisiNo";
		
	}
	
	
		@GetMapping("/maprico")
		public String postiRico(Model emme,  @RequestParam (name = "data") String dataRicerca,
				// posso specificare + parametri dello stesso oggetto/tipo mutuamente esclusivi
				@RequestParam (name = "Ortopedia", required=false) String orto  ,
				@RequestParam (name = "Ginecologia", required=false) String gine)
															
			{
			
			 dataStatica = 	dataRicerca;	
			 
			 
			 // cerco il reparto con la descrizione
			 
			 String reparto = null;
			 if ( orto == null  && gine == null);
			 	{ System.out.println("errore nel passaggio dei dati  - provvedere gestione");
			 		}
			 	
			 if ( orto == null )
				 reparto = gine;
				 else
					 reparto = orto;
			 			 	
			 
			 int repartoId = rep.findIdByNome(reparto);
			 			 
			
			 int freeSides = an.postiRico(dataRicerca, repartoId);
			 
						 
			// in questo caso il passaggio di emme di attributi non serve
			// emme.addAttribute("letti", freeSides);
			
			if (freeSides > 0) {
			
				return "ricoveroOk";
				
			} 
			else
				
				return "ricoveroNo";
		
		
	}
	
		
	
	
}
