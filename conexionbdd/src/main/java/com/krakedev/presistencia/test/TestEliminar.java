package com.krakedev.presistencia.test;

import com.krakedev.presistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			AdminPersonas.eliminar("1231540912");
		} catch (Exception e) {
			System.out.println(" error en el sistema: " + e.getMessage());
		}

	}

}
