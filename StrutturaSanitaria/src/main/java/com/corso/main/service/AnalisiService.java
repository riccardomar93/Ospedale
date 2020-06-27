package com.corso.main.service;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.corso.main.model.Analisi;

public interface AnalisiService extends JpaRepository<Analisi, String> {
	
	public Analisi findByIdRicetta(String idRicetta);
			
	

}
