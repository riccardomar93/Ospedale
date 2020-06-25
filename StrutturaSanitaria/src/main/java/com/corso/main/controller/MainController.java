package com.corso.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

//	@GetMapping(name = "/analisi")
//	public String linkAnalisi() {
//		return "analisi";
//	}
	
	@GetMapping("/")
	public String getIndex() {
		return "index";
	}
	
}
