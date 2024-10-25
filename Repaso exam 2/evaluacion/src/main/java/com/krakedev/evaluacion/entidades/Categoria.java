package com.krakedev.evaluacion.entidades;

public class Categoria {
	private int id;
	private String nombre;

	// CONSTRUCTOR VACIO
	public Categoria() {

	}

	// CONSTRUCTOR CON PARAMETRO
	public Categoria(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + "]";
	}

	// GET Y SET
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
