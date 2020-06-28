package com.corso.main.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.corso.main.model.Reparto;

public interface RepartoService extends JpaRepository<Reparto, Integer> {
	//public Integer findIdByNome (String nome);
	
		@Query(value = "SELECT r.id_reparto FROM reparto r WHERE r.nome = :nomeReparto " 
				, nativeQuery = true)
		Integer findIdByNome (String nomeReparto );
}
