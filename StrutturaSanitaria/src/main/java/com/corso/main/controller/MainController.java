package com.corso.main.controller;


import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.main.model.Reparto;
import com.corso.main.service.AnalisiService;
import com.corso.main.service.RepartoService;

//@Controller("/")
@Controller
public class MainController {
	
	@Autowired
	AnalisiService an;
//	RepartoService rep;
	@Autowired
	RepartoService rep;
	
	
	private static String dataStatica;
	private static int repartoStatico;
	

	@GetMapping("/maplabo")
	
	public String postiLab(Model emme, @RequestParam (name = "data") String dataRicerca )
	{
		
		// qui devo passare dataRicerca
		 dataStatica = 	dataRicerca;	
		 
		System.out.println("data passata " + dataRicerca);
		 		 
		 
		 String test = null;
		 
		
		 Integer freeSides = an.postiLabo(dataRicerca);
		// int freeSides1 = an.postiLabo(emme.getAttribute(data));
		 
		 System.out.println("postiliberi " + freeSides);
		 
		 
		 
		// in questo caso il passaggio di emme di attributi non serve
		// emme.addAttribute("letti", freeSides);
		
		if (freeSides > 0) {
			System.out.println("vado a analisiOk");
			test = "analisiOk";
			//return "analisiOk";
			
		} 
		else
			
			{
			System.out.println("vado a analisiNo");
			test = "analisiNo";
			//return "analisiNo";}
			}
		
		return test;
				
	}
		
		@GetMapping("/maprico")
		public String postiRico(Model emme,  @RequestParam (name = "data") String dataRicerca,
				// posso specificare + parametri dello stesso oggetto/tipo mutuamente esclusivi
				@RequestParam (name = "Ortopedia", required=false) String orto  ,
				@RequestParam (name = "Ginecologia", required=false) String gine)
		{
			
			 dataStatica = 	dataRicerca;	
			 System.out.println("dataStatica = " + dataStatica);
					 
			 // cerco il reparto con la descrizione
			 
			 String nomeReparto = null;
			 if ( orto == null  && gine == null)
			 	{ System.out.println("errore nel passaggio dei dati  - provvedere gestione");
			 		}
			 	
			 if ( orto == null )
				 nomeReparto = gine;
				 else
					 nomeReparto = orto;
			 
			 Integer repartoId = null;
						 
			 System.out.println("prima di cercareparto");
			 System.out.println("reparto " + nomeReparto);
			 
//			 Optional<Actor> attoreById=a.findById(index);
//				ArrayList<Actor> at=(ArrayList<Actor>) attoreById.stream().collect(Collectors.toList());
		 			
		
			 repartoId = rep.findIdByNome(nomeReparto);
			 
			 
			 System.out.println("dopo la query find");
			 // ***********   fisso l'id del reparto trovato
			 repartoStatico = repartoId;
			 System.out.println("reparto statico = " + repartoStatico);
			 
			 Integer freeSides = an.postiRico(dataRicerca, repartoId);
			 
			 System.out.println("dopo di cercaposti, freeSides = "+ freeSides);
			 
		 
			 String test = null;
			
			if (freeSides > 0) {
				System.out.println("vado a ricoveroOk");
				test = "analisiOk";
				
			} 
			else
			{	
				System.out.println("vado a ricoveroNo");
				test = "analisiNo";
			}
			
			return test;		
	}
		
		
	
}
