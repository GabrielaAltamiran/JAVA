package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productoActual;
	private int productosDevueltos;
	private int productosVendidos;

	public void imprimir() {
		System.out.println("**********************");
		System.out.println("Todo producto actual: " + productoActual);
		System.out.println("Todo poducto devuelto " + productosDevueltos);
		System.out.println("Todo producto vendido " + productosVendidos);
		System.out.println("***********************");
	}

	public void vender(int cantidadProdVendido) {
		productoActual = productoActual - cantidadProdVendido;
		productosVendidos = productosVendidos + cantidadProdVendido;
	}

	// -------------------------------------------------------------------
	public void devolver(int cantidadProdVendido) {
		productoActual = productoActual + cantidadProdVendido;
		productosDevueltos = productosDevueltos + cantidadProdVendido;
		if (productosVendidos > 0) {
			productosVendidos = productosVendidos - cantidadProdVendido;
		} else {
			productosVendidos = -0;
		}
	}

	// ***************************************************************************
	public int getProductoActual() {
		return productoActual;
	}

	public void setProductoActual(int productoActual) {
		this.productoActual = productoActual;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

}