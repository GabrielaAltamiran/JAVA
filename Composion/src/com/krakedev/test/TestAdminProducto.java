package com.krakedev.test;

import com.krakedev.composion.AdmiProducto;
import com.krakedev.composion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		Producto mc;
		AdmiProducto adim=new AdmiProducto();
		Producto productoA = new Producto("Dorito",0.60);
		Producto productoB = new Producto("Papitas",0.80);
		mc = adim.BuscarElMasCaro(productoA, productoB);
		if(mc == null) {
			System.out.println("Son iguales");
		}else {
			System.out.println("El mas caro: "+mc.getNombre());
		}
	}

}
