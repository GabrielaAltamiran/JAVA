package com.cmc.repaso.test;


import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validador=new Validacion();		
		System.out.println("El monto es "+validador.validarMonto(-50));
		System.out.println("El monto es "+validador.validarMonto(50));
		
	}

}   