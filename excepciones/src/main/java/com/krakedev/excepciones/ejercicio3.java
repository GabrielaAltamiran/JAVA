package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ejercicio3 {
	private static final Logger LOGGER = LogManager.getLogger(ejercicio3.class);
	
	public void metodo1() {
		String a = null;
		try {
			a.substring(0);
		}catch(Exception io) {
			System.out.println("Error");
			LOGGER.error("Error al obtener la subcadena",io);
			//pasar parametro 
			//primero mensaje de error
			//Segundo el obetto de Exception (La instancia)
		}
	}
	public static void main(String[] args) {
		ejercicio3 eje3 = new ejercicio3();
		eje3.metodo1();
	}
	
}
