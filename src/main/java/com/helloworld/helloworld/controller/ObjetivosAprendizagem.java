package com.helloworld.helloworld.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*Transforma a classe em Controller*/
@RequestMapping("/objetivos-aprendizagem") /*Endpoint*/

public class ObjetivosAprendizagem {
	
	@GetMapping
	public ArrayList <String> objetivosAprendizado() {
		ArrayList<String> objetivosSemana = new ArrayList<String>();
		objetivosSemana.add("Aprender Spring Boot - Em andamento");
		objetivosSemana.add("Aprender MySQL - OK");
		objetivosSemana.add("Aprender Banco de dados Relacional - OK");
		objetivosSemana.add("Aprender DER - OK");
		objetivosSemana.add("Aprender API Restful - Em andamento");
		objetivosSemana.add("Aprender Maven - Em andamento");
		System.out.println(objetivosSemana);
		return objetivosSemana;
	}

}
