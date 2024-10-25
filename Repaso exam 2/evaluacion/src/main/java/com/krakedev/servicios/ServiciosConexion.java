package com.krakedev.servicios;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;


@Path ("conexion")
public class ServiciosConexion {
@Path("probar")
@POST
	public void probarConn() {
		try {
			ConexionBDD.obtenerConexion();
		} catch (KrakeException e) {
			
			e.printStackTrace();
		}
	}

	
}
