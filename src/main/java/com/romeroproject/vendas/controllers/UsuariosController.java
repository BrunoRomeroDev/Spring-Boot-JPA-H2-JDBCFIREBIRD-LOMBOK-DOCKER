package com.romeroproject.vendas.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.romeroproject.vendas.entities.Usuarios;

import db.DB;

@RestController
@RequestMapping(value = "/usuarios/{users}")
public class UsuariosController {

	private Connection conn ;

	@GetMapping 
	public Usuarios findById(@PathVariable String users) throws Exception {
		PreparedStatement st = null;
		ResultSet rs = null;
		Usuarios obj = new Usuarios();
		conn = DB.getConnection();
		
		try {
			st = conn.prepareStatement(
				"SELECT * FROM users WHERE FIRSTNAME = ?");
			st.setString(1, users);
			rs = st.executeQuery();
			if (rs.next()) {
				
				obj.setId(rs.getInt("Id"));
				obj.setName(rs.getString("FIRSTNAME"));
				
			}
			return obj;
		}
		catch (SQLException e) {
			throw new Exception(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

}
