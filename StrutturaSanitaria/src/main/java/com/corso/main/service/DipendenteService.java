package com.corso.main.service;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corso.main.model.Dipendente;

public interface DipendenteService extends JpaRepository<Dipendente, Integer> {
	
	public ArrayList<Dipendente> findAll();
	
	public Dipendente findByIdDipendente(Integer idDipendente);
}

