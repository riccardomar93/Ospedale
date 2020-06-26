package com.corso.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "analisi")
public class Analisi {

    @Id
    @Column(name = "id_ricetta")
    private String idRicetta;

    private String nome_paziente;

    private String cognome_paziente;

    private String data;

    public Analisi(String nome_paziente, String cognome_paziente, String data) {
	super();
	this.nome_paziente = nome_paziente;
	this.cognome_paziente = cognome_paziente;
	this.data = data;
    }

    public Analisi() {
    }

    public String getidRicetta() {
	return idRicetta;
    }

    public void setidRicetta(String idRicetta) {
	this.idRicetta = idRicetta;
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
