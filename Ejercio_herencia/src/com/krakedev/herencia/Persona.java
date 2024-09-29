package com.krakedev.herencia;

public class Persona {
	public String nombre;
	public String cedula;
	
	public Persona(String nombre, String cedula) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
	}

	@Override
	public String toString() {
		return "Nombre  " + nombre + ", cedula  " + cedula ;
	}
}
