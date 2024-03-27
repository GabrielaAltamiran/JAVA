package com.cmc.evaluacion.entidades;

public class Cuota {
	private int numero;
	private double cuota;
	private double capital;
	private double inicio;
	private double interes;
	private double abanoCapital;
	private double saldo;
	//---------GET Y SET-------------
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getInicio() {
		return inicio;
	}
	public void setInicio(double inicio) {
		this.inicio = inicio;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAbanoCapital() {
		return abanoCapital;
	}
	public void setAbanoCapital(double abanoCapital) {
		this.abanoCapital = abanoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//-------------Constructor---------------------
	public Cuota(int numero) {
		this.numero = numero;
	}
	//-----------Metodo----------------------------
	public void mostrarPrestamo() {
		System.out.println(numero+"|"+cuota+"|"+inicio+"|"+interes+"|"+abanoCapital+"|"+saldo);
	}
	
	
	
	
	
}
