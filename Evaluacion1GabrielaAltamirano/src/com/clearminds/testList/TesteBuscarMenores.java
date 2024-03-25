package com.clearminds.testList;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TesteBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces admin = new MaquinaDulces();
		admin.agregarCelda(new Celda("L1"));
		admin.agregarCelda(new Celda("B3"));
		admin.agregarCelda(new Celda("C12"));
		admin.agregarCelda(new Celda("A25"));
		admin.agregarCelda(new Celda("B02"));
		admin.agregarCelda(new Celda("C98"));
		//----------------------------------------------------------
		Producto producto1=new Producto("L1","Papaya",0.55);
		admin.cargarProducto(producto1, "L1", 5);
		//----------------------------------------------------------
		Producto producto2=new Producto("B3","Papas",0.95);
		admin.cargarProducto(producto2, "B3", 15);
		//----------------------------------------------------------
		Producto producto3=new Producto("C12","Chetos",0.45);
		admin.cargarProducto(producto3, "C12", 12);
		//----------------------------------------------------------
		Producto producto4=new Producto("A25","Dorito",4.60);
		admin.cargarProducto(producto4, "A25", 7);
		//----------------------------------------------------------
		Producto producto5=new Producto("B02","Galletas",0.35);
		admin.cargarProducto(producto5, "B02", 32);
		//----------------------------------------------------------
		Producto producto6=new Producto("C98","Chocolate",0.75);
		admin.cargarProducto(producto6, "C98", 2);
		//----------------------------------------------------------
		
		double limite =4.00;
		
		ArrayList<Producto> producto = admin.buscarMenores(limite);
		for(int i=0;i<producto.size();i++) {
			Producto productos = producto.get(i);
			System.out.println("");
			System.out.println("----------------------------");
			System.out.println("Nombre: " + productos.getNombre() + " " + "Precio: " + productos.getPrecio());
			System.out.println("Nombre: " + productos.getNombre() + " " + "Precio: " + productos.getPrecio());
			System.out.println("Nombre: " + productos.getNombre() + " " + "Precio: " + productos.getPrecio());
			System.out.println("Nombre: " + productos.getNombre() + " " + "Precio: " + productos.getPrecio());
		
		}
		
		



	}

}
