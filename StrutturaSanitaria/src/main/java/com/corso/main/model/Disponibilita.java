package com.corso.main.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "disponibilita")
public class Disponibilita {

	@Id
	private Date data_disponibilita;
	
	private String reparto;
	
	private int posti_disponibili;

	public Disponibilita(String reparto, int posti_disponibili) {
		super();
		this.reparto = reparto;
		this.posti_disponibili = posti_disponibili;
	}

	public Disponibilita() {}

	public Date getData_disponibilita() {
		return data_disponibilita;
	}

	public void setData_disponibilita(Date data_disponibilita) {
		this.data_disponibilita = data_disponibilita;
	}

	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}

	public int getPosti_disponibili() {
		return posti_disponibili;
	}

	public void setPosti_disponibili(int posti_disponibili) {
		this.posti_disponibili = posti_disponibili;
	}
	
	
	
	
	
	
	
}
