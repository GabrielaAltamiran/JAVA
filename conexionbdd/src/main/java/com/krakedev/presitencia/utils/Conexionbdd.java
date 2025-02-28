package com.krakedev.presitencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Conexionbdd {
	private final static String DRIVER="org.postgresql.Driver";
	private final static String URL="jdbc:postgresql://localhost:5433/ejercios";
	private final static String USUARIO ="postgres";
	private final static String PASSWORD = "gabriela29";
	private static final Logger LOGGER=LogManager.getLogger(Conexionbdd.class);
	public static Connection conectar() throws Exception {
		
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection( URL, USUARIO,PASSWORD);
			LOGGER.debug("CONEXION EXITOSA");
		} catch (ClassNotFoundException e) {
			//RELANZANDO LA EXPECION
			LOGGER.error("Error en la Infraestructura ",e);
			
			throw new Exception("Error en la Infraestructura");
		} catch (SQLException e) {
			LOGGER.error("Error al conectarse revise su usurio o contraseña ",e);
			throw new Exception("Error al conectarse revise su usurio o contraseña");
		}
		return connection;

	}
}
