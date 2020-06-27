package com.corso.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credenziali")
public class Login {

    @Id
    @Column(name = "username")
    private String username;
    private String password;
    private String nome;
    private String cognome;

    public Login() {
    }

    public String getUsername() {
	return username;
    }

    public void setUsername(String username) {
	this.username = username;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
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

    public Login(String username, String password, String nome, String cognome) {
	super();
	this.username = username;
	this.password = password;
	this.nome = nome;
	this.cognome = cognome;
    }

}
