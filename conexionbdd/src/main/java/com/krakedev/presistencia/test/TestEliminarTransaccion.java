package com.krakedev.presistencia.test;

import com.krakedev.presistencia.servicios.AdminTransacciones;

public class TestEliminarTransaccion {

	public static void main(String[] args) {
		try {
			AdminTransacciones.eliminar(29);
		} catch (Exception e) {
			System.out.println(" error en el sistema: " + e.getMessage());
		}

	}

}
