package com.romeroproject.vendas.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.romeroproject.vendas.entities.pedidos;
@Repository
public interface pedidoRepository extends JpaRepository<pedidos,Long> {

	

}
