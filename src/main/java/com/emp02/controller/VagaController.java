package com.emp02.controller;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp02.model.Vaga;
import com.emp02.repository.VagaRepository;

@RestController
public class VagaController {
	
	@Autowired
	private VagaRepository vagaRepository;
	
	@GetMapping("/vagas")
	List<Vaga> all(){
		return vagaRepository.findAll();
	}
}
