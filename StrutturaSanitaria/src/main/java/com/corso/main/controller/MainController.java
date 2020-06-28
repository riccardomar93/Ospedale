package com.corso.main.controller;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.main.model.Analisi;
import com.corso.main.model.Dipendente;
import com.corso.main.model.Login;
import com.corso.main.model.Responsabile;
import com.corso.main.model.Ricovero;
import com.corso.main.service.AnalisiService;
import com.corso.main.service.DipendenteService;
import com.corso.main.service.LoginService;
import com.corso.main.service.RepartoService;
import com.corso.main.service.ResponsabileService;
import com.corso.main.service.RicoveroService;


@Controller
public class MainController {
	private static int id_repartoStatico;
	private static String repartoStatico;
	private static String dataStatica;
	
	@Autowired
	AnalisiService as;

	@Autowired
	RicoveroService r;
	
	@Autowired
	RepartoService rep;
	
	@Autowired
	ResponsabileService rs2;

	@Autowired
	LoginService ls;

	@Autowired
	DipendenteService ds;
	
	@GetMapping(value = "/homePage")
	public String getIndex() {
		return "index";
	}
	@GetMapping(value = "/analisi")
	public String linkAnalisi() {
		return "analisi";
	}
	@GetMapping(value = "/ricovero")
	public String linkRicovero() {
		return "ricovero";
	}
	@GetMapping(value = "/login")
	public String linkLogin() {
		return "login";
	}
	@GetMapping(value = "/redirectAnalisi")
	public String redirectAnalisi() {
		return "analisi";
	}
	@GetMapping(value = "/redirectRicover")
	public String redirectRicovero() {
		return "ricovero";
	}
	@GetMapping(value = "/redirectLogin")
	public String redirectLogin() {
		return "login";
	}
	@GetMapping(value = "/ricercaDipendenti")
	public String ricercaDipendenti() {
		return "allDipendenti";
	}
	@GetMapping(value = "/newDipendente")
	public String newDipendente () {
		return "newDipendente";
	}
	@GetMapping(value = "/deleteDipendente")
	public String deleteDipendente () {
		return "deleteDipendente";
	}
	@GetMapping(value = "/updateDipendente")
	public String updateDipendente () {
		return "updateDipendente";
	}


@GetMapping("/inserimentoAnalisi")
	public String insAnalisi(Model m, @RequestParam(name="cod_ricetta") String idRicetta, @RequestParam (name="nome_paziente") String nome_paziente, 
		@RequestParam(name="cognome_paziente") String cognome_paziente) {
		
		Responsabile re= rs2.findByIdReparto(3);
		
		String analisi=null;
		Analisi a2= as.findByIdRicetta(idRicetta);
		
		if(a2==null) {
			analisi="confermaAnalisi";
		Analisi a=new Analisi(idRicetta,nome_paziente,cognome_paziente,dataStatica);
		System.out.println(a.getIdRicetta());
		as.saveAndFlush(a);
		//as.decrementoPosti(dataStatica);
		System.out.println("non c'e'");
			
		m.addAttribute("cod_ricetta",a.getIdRicetta());
		m.addAttribute("nome_paziente",a.getNome_paziente());
		m.addAttribute("cognome_paziente",a.getCognome_paziente());
		m.addAttribute("nome_responsabile", re.getNome());
		m.addAttribute("cognome_responsabile", re.getCognome());
		m.addAttribute("data",dataStatica);
		
		return analisi;
	}
		else {
				System.out.println("ricetta c'e");
			analisi="analisiNo";
			return analisi;
	}
	}


@GetMapping("/inserimentoRicovero")
public String inserisci(Model m, @RequestParam(name = "nome_paziente") String nome_paziente,
    @RequestParam(name = "cognome_paziente") String cognome_paziente) {

Responsabile r2 = rs2.findByIdReparto(id_repartoStatico);

Ricovero ri = new Ricovero(dataStatica, id_repartoStatico, nome_paziente, cognome_paziente);
System.out.println(repartoStatico);
r.saveAndFlush(ri);

m.addAttribute("nome_responsabile", r2.getNome());
m.addAttribute("cognome_responsabile", r2.getCognome());

m.addAttribute("nome_paziente", ri.getNome_paziente());
m.addAttribute("cognome_paziente", ri.getCognome_paziente());

m.addAttribute("data",dataStatica);
m.addAttribute("reparto",repartoStatico);

return "confermaRicovero";

}

@GetMapping("/controlloCredenziali")
public String controlla(Model m, @RequestParam(name = "username") String username,
    @RequestParam(name = "password") String password) {

Login l = ls.findByUsernameAndPassword(username, password);

if (l != null) {

    return "gestioneDipendenti";
    

} else
    return "loginFallito";
    
}

@GetMapping("/ricercaDipAll")
public String cercaAll(Model m) {

ArrayList<Dipendente> d = (ArrayList) ds.findAll();

m.addAttribute("lista",d);
return "listaDipendenti";

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


@GetMapping("/maplabo")

public String postiLab(Model emme, @RequestParam (name = "data") String dataRicerca )
{
	
	// qui devo passare dataRicerca
	 dataStatica = 	dataRicerca;	
	 
	System.out.println("data passata " + dataRicerca);
	 		 
	 
	 String test = null;
	 
	
	 Integer freeSides = as.postiLabo(dataRicerca);
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
			@RequestParam (name = "Reparto", required=false) String reparto) 
	{
		repartoStatico = reparto;
		 dataStatica = 	dataRicerca;	
		 System.out.println("dataStatica = " + dataStatica);
				 
		 // cerco il reparto con la descrizione
		 
		 
		 
//		 Optional<Actor> attoreById=a.findById(index);
//			ArrayList<Actor> at=(ArrayList<Actor>) attoreById.stream().collect(Collectors.toList());
	 			
		 Integer repartoId = null;
		 repartoId = rep.findIdByNome(reparto);
		 
		 
		 System.out.println("dopo la query find");
		 // ***********   fisso l'id del reparto trovato
		 id_repartoStatico = repartoId;
		 System.out.println("reparto statico = " + id_repartoStatico);
		 
		 Integer freeSides = as.postiRico(dataRicerca, repartoId);
		 
		 System.out.println("dopo di cercaposti, freeSides = "+ freeSides);
		 
	 
		 String test = null;
		
		if (freeSides > 0) {
			System.out.println("vado a ricoveroOk");
			test = "ricoveroOk";
			
		} 
		else
		{	
			System.out.println("vado a ricoveroNo");
			test = "ricoveroNo";
		}
		
		return test;		
}


	
	
}
