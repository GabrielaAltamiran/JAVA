package com.krakedev.presistencia.test;

import java.util.ArrayList;

import com.krakedev.presistencia.entidades.Persona;
import com.krakedev.presistencia.servicios.AdminPersonas;

public class TestConsultaPersonas {

	public static void main(String[] args) {
		try {
			ArrayList<Persona> per=AdminPersonas.buscarPorNombre("i");
			System.out.println(per);
		} catch (Exception e) {
			
		System.out.println(e.getLocalizedMessage());
		}
	}

}
