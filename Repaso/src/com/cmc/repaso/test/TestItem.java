package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item inte1 = new Item(); 
		Item inte2 = new Item(); 
		Item inte3 = new Item(); 
		//---------------------------------------
		inte1.setNombre("Harina");
		inte1.setProductoActual(20);
		inte1.setProductosDevueltos(0);
		inte1.setProductosVendidos(0);
		inte1.imprimir();
		//-------------------------------------
		inte2.setNombre("Azucar");
		inte2.setProductoActual(15);
		inte2.setProductosDevueltos(0);
		inte2.setProductosVendidos(0);
		inte2.imprimir();
		inte2.devolver(5);
		System.out.println("Poducto devuelto 5 de azucar");
		inte2.imprimir();
		//-----------------------------------------
		inte3.setNombre("Arroz");
		inte3.setProductoActual(21);
		inte3.setProductosDevueltos(0);
		inte3.setProductosVendidos(1);
		inte3.imprimir();
		inte3.vender(6);;
		System.out.println("Productos vendidos 6 de Arroz ");
		inte3.imprimir();
	}

}
