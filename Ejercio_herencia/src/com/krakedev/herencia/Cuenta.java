package com.krakedev.herencia;

public class Cuenta {
	public  String numeroCuenta;
	public double saldo;
	
	public Cuenta(String numeroCuenta, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Numero de Cuenta: " + numeroCuenta +" " + "su saldo es  " + saldo + "";
	}
	
	
}
