package com.krakedev.composion;

public class Producto {
	private String nombre;
	private double precio;
	//------------------CONSTRUCTOR-------------------------------
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	//--------------------GET Y SET---------------------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}	
	
}
