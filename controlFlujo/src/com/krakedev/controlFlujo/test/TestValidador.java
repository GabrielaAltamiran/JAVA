package com.krakedev.controlFlujo.test;

import com.krakedev.controlFlujo.Validar;

public class TestValidador {

	public static void main(String[] args) {
		Validar validador=new Validar();
		validador.validarEdad(10);
		validador.validarEdad(20);
		validador.validarEdad(18);
		validador.validarEdad(16);
		validador.validarEdad(-3);
	}

}
