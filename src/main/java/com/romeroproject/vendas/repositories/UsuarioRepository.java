package com.romeroproject.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romeroproject.vendas.entities.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios,Long> {

}
