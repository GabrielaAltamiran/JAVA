package com.krakedev.presistencia.test;



import com.krakedev.presistencia.entidades.Persona;
import com.krakedev.presistencia.servicios.AdminPersonas;

public class TestConsultaCedula {

	public static void main(String[] args) {
		try {
			Persona perCedula=AdminPersonas.buscarPorCedula("1231540912");
			System.out.println(perCedula);
		} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
		}

	}

}
