package com.krakedev.estaticos;

public class Calculos {
	//final hace que el valor designado no se pueda cambiar en ninguna parte del codigo
	//Se convierte en condicional la variable
	private final double iva = 12;
	
	public double calcularIva(double monto) {
		return monto * iva/100;
		
	}
	
}
