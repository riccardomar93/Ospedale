package com.corso.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	
	@GetMapping("/")
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
	
	
	
}
