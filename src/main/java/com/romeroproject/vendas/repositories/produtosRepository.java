package com.romeroproject.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.romeroproject.vendas.entities.produtos;

public interface produtosRepository extends JpaRepository<produtos, Long> {

}
