package com.example.exercicossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@GetMapping(path = {"/ola"})
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	@GetMapping(path = {"/ola"})
	public String saudacao() {
		return "Olá Spring Boot!";
	}
}
