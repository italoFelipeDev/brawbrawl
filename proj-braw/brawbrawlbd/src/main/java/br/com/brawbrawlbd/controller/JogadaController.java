package br.com.brawbrawlbd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.brawbrawlbd.repository.JogadaRepository;

@RestController
public class JogadaController {
	
	private final JogadaRepository repository;
	JogadaController(JogadaRepository repository){
		this.repository = repository;
	}
	
	//@GetMapping("/jogada/{id}")
	//int getPlayerDmg(@PathVariable int id){
		//return repository.PlayerDamage(id);
		
//	}

}
