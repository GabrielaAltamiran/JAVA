package com.krakedev.entidades;

public class Cliente {
	private String cedula;
	private String nombre;
	private int Numero_Hijos;
	
	
	public int getNumero_Hijos() {
		return Numero_Hijos;
	}
	public void setNumero_Hijos(int numero_Hijos) {
		Numero_Hijos = numero_Hijos;
	}
	@Override
	public String toString() {
		return "Cliente [cedula=" + cedula + ", nombre=" + nombre + "]";
	}
	
	public Cliente() {
	}
	public Cliente(String cedula, String nombre, int numeroHijos) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.Numero_Hijos = numeroHijos;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
