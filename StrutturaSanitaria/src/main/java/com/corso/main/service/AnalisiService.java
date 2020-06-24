package com.corso.main.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corso.main.model.Analisi;

public interface AnalisiService extends JpaRepository<Analisi, String> {

}
