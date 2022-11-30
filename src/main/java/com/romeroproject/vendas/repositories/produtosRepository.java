package com.romeroproject.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.romeroproject.vendas.entities.produtos;
@Repository
public interface produtosRepository extends JpaRepository<produtos, Long> {

}
