package com.romeroproject.vendas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pedidos")
public class pedidos {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String desc;
	
	@ManyToOne
	@JoinColumn(name = "produtos_id" )
	private pedidos pedidos;
	
	public pedidos() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public pedidos getPedidos() {
		return pedidos;
	}

	public void setPedidos(pedidos pedidos) {
		this.pedidos = pedidos;
	}

}
