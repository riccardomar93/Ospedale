package com.corso.main.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.corso.main.model.Analisi;
import com.corso.main.model.Disponibilita;

public interface AnalisiService extends JpaRepository<Disponibilita, String> {
	
	 @Query(value = "SELECT posti_disponibili FROM disponibilita WHERE data_disponibilita"
	 		+ " = :data_disponibilita ", nativeQuery = true)
	  int postiLabo (String data_disponibilita );
	 
	 @Query(value = "SELECT posti_disponibili FROM disponibilita WHERE data_disponibilita"
		 		+ " = :data_disponibilita and id_reparto = :id_reparto", nativeQuery = true)
		  int postiRico (String data_disponibilita, int id_reparto );

}
