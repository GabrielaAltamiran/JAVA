package com.krakedev.presistencia.test;

import com.krakedev.presistencia.entidades.Transacciones;
import com.krakedev.presistencia.servicios.AdminTransacciones;

public class TestConsultarCodigo {

	public static void main(String[] args) {
		try {
			Transacciones codigo = AdminTransacciones.buscarPorcodigo(29);
			System.out.println(codigo);
		} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		}
		

	}

}
