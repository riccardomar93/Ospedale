package com.corso.main.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corso.main.model.Reparto;
import com.corso.main.model.Responsabile;

public interface ResponsabileService extends JpaRepository<Responsabile, Integer> {
	
	public Responsabile findByIdReparto(int idReparto);

}
