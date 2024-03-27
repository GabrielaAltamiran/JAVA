package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {
		//Monto
		double co = prestamo.getMonto();
		//TasaInteres
		double in = prestamo.getInteres();
		double interesAnual = (in / 12) / 100;
		//Plazo
		int n = prestamo.getPlazo();
		//Formula
		double cuota = (co * interesAnual) / (1 - Math.pow(1 + interesAnual, -n));

		return cuota;

	}
}
