package com.krakedev.composion;

public class Direccion {
	private String callePrincipal;
	private String calleSecunadaria;
	private String numero;
	private double latitud;
	private double longitud;
	
	
	
	//-------------CONSTRUCTOR---CON PARAMETROS-----------------------------
	public Direccion(String callePrincipal, String calleSecunadaria, String numero) {
		super();
		this.callePrincipal = callePrincipal;
		this.calleSecunadaria = calleSecunadaria;
		this.numero = numero;
	}
	//-------------CONSTRUCTOR---SIN--PARAMETROS-----------------------------
	public Direccion() {
	}

	//Get y set 
	public String getCallePrincipal() {
		return callePrincipal;
	}
	public void setCallePrincipal(String callePrincipal) {
		this.callePrincipal = callePrincipal;
	}
	public String getCalleSecunadaria() {
		return calleSecunadaria;
	}
	public void setCalleSecunadaria(String calleSecunadaria) {
		this.calleSecunadaria = calleSecunadaria;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	

	
}
