package com.corso.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "responsabile")
public class Responsabile {
	
	@Id
	
	private Integer id_responsabile;
	
	private String nome;
	
	private String cognome;
	@Column(name="id_Reparto")
	private Integer idReparto;
	
	public Responsabile() {}
	
	public Responsabile(String nome,String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public Integer getId_responsabile() {
		return id_responsabile;
	}

	public void setId_responsabile(Integer id_responsabile) {
		this.id_responsabile = id_responsabile;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public Integer getidReparto() {
		return idReparto;
	}

	public void setidReparto(Integer idReparto) {
		this.idReparto = idReparto;
	}
	
	
	
	
}
