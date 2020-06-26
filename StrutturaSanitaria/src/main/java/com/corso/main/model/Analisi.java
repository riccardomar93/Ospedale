package com.corso.main.model;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "analisi")
public class Analisi {

	
	@Id
	private String id_ricetta;
	
	private String nome_paziente;
	
	private String cognome_paziente;
	
	private String data;

	public Analisi(String nome_paziente, String cognome_paziente, String data) {
		super();
		this.nome_paziente = nome_paziente;
		this.cognome_paziente = cognome_paziente;
		this.data = data;
	}
	


	public Analisi(String id_ricetta, String nome_paziente, String cognome_paziente, String data) {
		super();
		this.id_ricetta = id_ricetta;
		this.nome_paziente = nome_paziente;
		this.cognome_paziente = cognome_paziente;
		this.data = data;
	}



	public Analisi() {}

	public String getId_ricetta() {
		return id_ricetta;
	}

	public void setId_ricetta(String id_ricetta) {
		this.id_ricetta = id_ricetta;
	}

	public String getNome_paziente() {
		return nome_paziente;
	}

	public void setNome_paziente(String nome_paziente) {
		this.nome_paziente = nome_paziente;
	}

	public String getCognome_paziente() {
		return cognome_paziente;
	}

	public void setCognome_paziente(String cognome_paziente) {
		this.cognome_paziente = cognome_paziente;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
	
}
