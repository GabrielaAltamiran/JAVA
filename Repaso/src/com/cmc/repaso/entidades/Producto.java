package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	//-------------------------------Constructor---------------------


	public Producto(String nombre,double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}

	public void setPrecio(double precio) {
		
	if (precio > 0) {
		System.out.println("Numero correcto");
	}else{
		precio=precio * -1;
	}
	this.precio=precio;
	
}
	public double getPrecio() {
		return precio;
	}

	public double calculaPrecioPromo(double descuento) {
		return precio * 1 - descuento / 100 ;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
