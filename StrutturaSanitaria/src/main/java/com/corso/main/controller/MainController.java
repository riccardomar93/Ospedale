package com.corso.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {
	
	
	@GetMapping(value = "/homePage")
	public String getIndex() {
		return "index";
	}
	@GetMapping(value = "/analisi")
	public String linkAnalisi() {
		return "analisi";
	}
	@GetMapping(value = "/ricovero")
	public String linkRicovero() {
		return "ricovero";
	}
	@GetMapping(value = "/login")
	public String linkLogin() {
		return "login";
	}
	@GetMapping(value = "/redirectAnalisi")
	public String redirectAnalisi() {
		return "analisi";
	}
	@GetMapping(value = "/redirectRicover")
	public String redirectRicovero() {
		return "ricovero";
	}
	@GetMapping(value = "/redirectLogin")
	public String redirectLogin() {
		return "login";
	}
	
	
	
}
