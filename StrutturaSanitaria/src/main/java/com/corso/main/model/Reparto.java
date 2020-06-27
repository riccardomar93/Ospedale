package com.corso.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reparto")
public class Reparto {

	@Id
	private Integer idReparto;
	
	private String nome;
	
	private int posti_totali;
	
	private Integer id_responsabile;
	
	private int numero_personale;

	public Reparto(String nome, int posti_totali, Integer id_responsabile,
			int numero_personale) {
		super();
		this.nome = nome;
		this.posti_totali = posti_totali;
		this.id_responsabile = id_responsabile;
		this.numero_personale = numero_personale;
	}

	public Reparto() {}

	public Integer getidReparto() {
		return idReparto;
	}

	public void setidReparto(Integer idReparto) {
		this.idReparto = idReparto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getPosti_totali() {
		return posti_totali;
	}

	public void setPosti_totali(int posti_totali) {
		this.posti_totali = posti_totali;
	}

	public Integer getId_responsabile() {
		return id_responsabile;
	}

	public void setId_responsabile(Integer id_responsabile) {
		this.id_responsabile = id_responsabile;
	}

	public int getNumero_personale() {
		return numero_personale;
	}

	public void setNumero_personale(int numero_personale) {
		this.numero_personale = numero_personale;
	}


	
	
	
}
