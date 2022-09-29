package com.helloworld.helloworld.controller;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /*Transforma a classe em Controller*/
@RequestMapping("/bsm-generation") /*Endpoint*/
public class BsmGeneration {
	
	
	@GetMapping
	public ArrayList <String> bsms() {
		ArrayList<String> bsmGen = new ArrayList<String>();
		bsmGen.add("Orientação ao Futuro");
		bsmGen.add("Responsabilidade Pessoal");
		bsmGen.add("Mentalidade de Crescimento");
		bsmGen.add("Persistência");
		bsmGen.add("Trabalho em Equipe");
		bsmGen.add("Atenção aos detalhes");
		bsmGen.add("Proatividade");
		bsmGen.add("Comunicação");
		
		
		System.out.println(bsmGen);
		return bsmGen;
	}

}
