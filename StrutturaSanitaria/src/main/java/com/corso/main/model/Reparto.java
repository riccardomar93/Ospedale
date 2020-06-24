package com.corso.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reparto")
public class Reparto {

	@Id
	private Integer id_reparto;
	
	private String nome;
	
	private int posti_disponibili;
	
	private int posti_totali;
	
	private Integer id_responsabile;
	
	private int numero_personale;

	public Reparto(String nome, int posti_disponibili, int posti_totali, Integer id_responsabile,
			int numero_personale) {
		super();
		this.nome = nome;
		this.posti_disponibili = posti_disponibili;
		this.posti_totali = posti_totali;
		this.id_responsabile = id_responsabile;
		this.numero_personale = numero_personale;
	}

	public Reparto() {}

	public Integer getId_reparto() {
		return id_reparto;
	}

	public void setId_reparto(Integer id_reparto) {
		this.id_reparto = id_reparto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPosti_disponibili() {
		return posti_disponibili;
	}

	public void setPosti_disponibili(int posti_disponibili) {
		this.posti_disponibili = posti_disponibili;
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
