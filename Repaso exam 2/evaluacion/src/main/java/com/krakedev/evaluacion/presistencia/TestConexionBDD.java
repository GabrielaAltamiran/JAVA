package com.krakedev.evaluacion.presistencia;

import java.sql.Connection;

import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

public class TestConexionBDD {

	public void probarConexion() {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			if (con != null) {
				System.out.println("CONEXION EXITOSA");
			}
			System.out.println("ERROR AL OBTENER CONEXION");
		} catch (KrakeException e) {
			
			e.printStackTrace();
		}

	}

}
