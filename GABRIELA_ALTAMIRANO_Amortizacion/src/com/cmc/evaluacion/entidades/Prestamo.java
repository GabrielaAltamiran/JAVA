package com.cmc.evaluacion.entidades;

public class Prestamo {
	private double Monto;
	private double Interes;
	private int Plazo ;
//-----------CONSTRUCTOR CON LOS 3 PARAMETRO MPN,INTE,PLA---
	public Prestamo(double monto, double interes, int plazo) {
		Monto = monto;
		Interes = interes;
		Plazo = plazo;
	}
//-----------GET Y SET----------------
	public double getMonto() {
		return Monto;
	}
	public void setMonto(double monto) {
		Monto = monto;
	}
	public double getInteres() {
		return Interes;
	}
	public void setInteres(double interes) {
		Interes = interes;
	}
	public int getPlazo() {
		return Plazo;
	}
	public void setPlazo(int plazo) {
		Plazo = plazo;
	}
//---------------



}
