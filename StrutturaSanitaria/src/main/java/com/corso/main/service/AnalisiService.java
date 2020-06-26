package com.corso.main.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.corso.main.model.Disponibilita;

public interface AnalisiService extends JpaRepository<Disponibilita, String> {
	
	 @Query(value = "SELECT disp.posti_disponibili FROM disponibilita disp WHERE disp.data_disponibilita = :data_disponibilita"
	 		+ " and id_reparto = 3" , nativeQuery = true)
	 Integer postiLabo (String data_disponibilita );
	 
	 @Query(value = "SELECT disp.posti_disponibili FROM disponibilita disp WHERE disp.data_disponibilita = :data_disponibilita"
		 		+ " and id_reparto = :id_reparto" , nativeQuery = true)
	 Integer postiRico (String data_disponibilita, int id_reparto );

}
