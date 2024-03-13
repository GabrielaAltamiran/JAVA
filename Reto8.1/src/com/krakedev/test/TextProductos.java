package com.krakedev.test;

import com.krakedev.Productos;

public class TextProductos {

	public static void main(String[] args) {
		Productos productoA;
		Productos productoB;
		Productos productoC;
		//--------------------------------Instancia----------------------------
		productoA=new Productos("Mentol 300ml","para golpes y resfriado",3.50,25);
		productoB=new Productos("Crema 1L","Para la hidratacion de cuerpo y cara",20.35,5);
		productoC=new Productos("Paracetamos","Dolor del cuerpo",25.20,102);
		//-------------------------------Modificar-----------------------------
		//-------------------------------ProductoA-----------------------------
		
		System.out.println("Su pedido de la farmacia ECONOMICA es de un "+productoA.getNombre());
		System.out.println("Sirve para "+productoA.getDescripcion());
		System.out.println("El precio de su producto es $:"+productoA.getPrecio());
		System.out.println("El stock actual :"+productoA.getStockActual());
		System.out.println("------------------------------------------------");
		//-------------------------------Modificar-----------------------------
		//-------------------------------ProductoB-----------------------------
		System.out.println("Su pedido de la farmacia TORRES es de un "+productoB.getNombre());
		System.out.println("Sirve para :"+productoB.getDescripcion());
		System.out.println("El precio de su producto es $:"+productoB.getPrecio());
		System.out.println("El stock actual :"+productoB.getStockActual());
		System.out.println("------------------------------------------------");
		//-------------------------------Modificar-----------------------------
		//-------------------------------ProductoC-----------------------------
		
		System.out.println("Su pedido de la farmacia SANA SANA es de un "+productoC.getNombre());
		System.out.println("Sirve para :"+productoC.getDescripcion());
		System.out.println("El precio de su producto es $:"+productoC.getPrecio());
		System.out.println("El stock actual :"+productoC.getStockActual());
		System.out.println("------------------------------------------------");
	}

}
