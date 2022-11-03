package com.romeroproject.vendas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="USERS")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column( name="FIRSTNAME")
	private String name;
	
	@Column(name="MIDDLENAME")
	private String mname;
	
	@Column(name="LASTNAME")
	private String lname;
	
	@Column(name="FULLNAME")
	private String fname;
		
	private String street;
	

}
