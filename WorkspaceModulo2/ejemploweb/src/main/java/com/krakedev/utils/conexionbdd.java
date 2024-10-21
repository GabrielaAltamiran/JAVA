package com.krakedev.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.krakedev.excepciones.Karakedevexception;

public class conexionbdd {
	public static Connection obtenerConexion() throws Karakedevexception {
		Context ctx = null;
		DataSource ds = null;
		Connection con = null;
		try {
			ctx = new InitialContext();
			// JNDI = BUSCAR ELEMENTOS DE MANERA GENERAL
			ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/ConexionPG");
			con = ds.getConnection();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
			throw new Karakedevexception("Error de conexion");
		}
		return con;
	}
}
