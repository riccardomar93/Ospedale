package com.corso.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dipendente")
public class Dipendente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dipendente", unique = true, nullable = false)
    private Integer idDipendente;

    private String nome;

    private String cognome;

    private double stipendio;

    public Dipendente() {

    }

    public Dipendente(Integer idDipendente, String nome, String cognome, double stipendio) {
	super();
	this.idDipendente = idDipendente;
	this.nome = nome;
	this.cognome = cognome;
	this.stipendio = stipendio;
    }

    public Dipendente(String nome, String cognome, double stipendio) {
	super();
	this.nome = nome;
	this.cognome = cognome;
	this.stipendio = stipendio;
    }

    public Integer getIdDipendente() {
	return idDipendente;
    }

    public void setIdDipendente(Integer idDipendente) {
	this.idDipendente = idDipendente;
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

    public double getStipendio() {
	return stipendio;
    }

    public void setStipendio(double stipendio) {
	this.stipendio = stipendio;
    }

}
