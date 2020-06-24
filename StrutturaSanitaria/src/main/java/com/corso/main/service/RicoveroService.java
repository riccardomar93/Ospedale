package com.corso.main.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corso.main.model.Ricovero;

public interface RicoveroService extends JpaRepository<Ricovero, Integer> {

}
