package com.corso.main.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corso.main.model.Login;

public interface LoginService extends JpaRepository<Login, Integer> {

    public Login findByUsernameAndPassword(String username, String password);

}
