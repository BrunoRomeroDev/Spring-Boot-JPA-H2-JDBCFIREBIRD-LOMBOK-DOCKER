package com.romeroproject.vendas.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romeroproject.vendas.entities.Usuarios;

@RestController
public class UsuarioControllerJpa {
	
	@Autowired
	private UsuarioRepository usuariorepository;
	
	@GetMapping(value = "/usuarios")
	public List<Usuarios> lista(){
		return usuariorepository.findAll();
	}
	
	

}
