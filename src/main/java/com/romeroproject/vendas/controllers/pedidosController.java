package com.romeroproject.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romeroproject.vendas.entities.pedidos;
import com.romeroproject.vendas.repositories.pedidoRepository;

@RestController
@RequestMapping(value = "/pedidos")
public class pedidosController {
	
	@Autowired
	private pedidoRepository repository;
		
	@GetMapping
	public List<pedidos> findAll(){
		List<pedidos> result = repository.findAll();
		return result;
		
	}

}
