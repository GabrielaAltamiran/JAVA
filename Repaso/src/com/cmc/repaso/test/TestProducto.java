package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto("Arroz",25);
		Producto producto2 = new Producto("Harina",0);
		Producto producto3 = new Producto("Fideo",0);
		System.out.println("Precio: "+producto1.getNombre()+" "+producto1.getPrecio());
		producto2.setPrecio(50);
		System.out.println("Precio de producto: "+producto2.getNombre()+" "+producto2.getPrecio());
		producto3.setPrecio(-95);
		double des = producto3.calculaPrecioPromo(100);
		System.out.println("Descuento de su producto: "+producto3.getNombre()+" "+des);

	}

}
