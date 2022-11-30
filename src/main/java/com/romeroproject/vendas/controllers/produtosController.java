package com.romeroproject.vendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romeroproject.vendas.entities.produtos;
import com.romeroproject.vendas.repositories.produtosRepository;

@RestController
@RequestMapping(value = "/produtos")
public class produtosController {
	
	@Autowired
	private produtosRepository repository;
	
	@GetMapping
	public List<produtos> findAll(){
		List<produtos> result = repository.findAll();
		return result;
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<produtos> findById(@PathVariable Long id){
		return repository.findById(id)
				.map(produtos->ResponseEntity.ok(produtos))
				.orElse(ResponseEntity.notFound().build());
		
	}
	
	@PostMapping
	public produtos insert(@RequestBody produtos produto) {
		produtos result = repository.save(produto);
		return result;
	}

}
