package com.corso.main.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.corso.main.model.Analisi;

public interface AnalisiService extends JpaRepository<Analisi, String> {
	
	public Analisi findByIdRicetta(String idRicetta);
	@Query(value = "SELECT disp.posti_disponibili FROM disponibilita disp WHERE disp.data_disponibilita = :data_disponibilita"
	 		+ " and id_reparto = 3" , nativeQuery = true)
	 Integer postiLabo (String data_disponibilita );
	 
	 @Query(value = "SELECT disp.posti_disponibili FROM disponibilita disp WHERE disp.data_disponibilita = :data_disponibilita"
		 		+ " and id_reparto = :id_reparto" , nativeQuery = true)
	 Integer postiRico (String data_disponibilita, int id_reparto );
	 
	 @Query(value = "UPDATE disponibilita disp SET disp.posti_disponibili = disp.posti_disponibili -1 WHERE disp.data_disponibilita = :data_disponibilita AND disp.id_reparto = 3",nativeQuery = true)
	 void decrementoPosti(String data_disponibilita);


}
