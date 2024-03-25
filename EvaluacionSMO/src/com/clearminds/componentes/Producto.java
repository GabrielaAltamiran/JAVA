package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String Codigo;
	//----------------Metodos----------------

	public void incrementarPrecio(int porcentajeDeIncremento) {;
		precio=precio + porcentajeDeIncremento/100 *porcentajeDeIncremento ;
			
		}
	public void disminuirPrecio(double descuento) {
		precio = precio - descuento/100 * descuento ;
	}
	//Contructor
	public Producto(String nombre, double precio,String codigo) {
		this.nombre = nombre;
		this.precio = precio;
		Codigo = codigo;
	}
	public Producto(String codigo, String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		Codigo = codigo;
	}
	//get y set 
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
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	

}
