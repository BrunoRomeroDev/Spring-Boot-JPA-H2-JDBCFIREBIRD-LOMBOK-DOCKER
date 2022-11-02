package com.romeroproject.vendas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.romeroproject.vendas.entities.pedidos;

public interface pedidoRepository extends JpaRepository<pedidos,Long> {

	

}
