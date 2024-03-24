package com.krakedev.composion;

public class AdmiProducto {
	//Recibe 2 productos
	//Retona el producto de mayor precio
	//Si tiene el mismo retorna null
	public Producto BuscarElMasCaro(Producto p1,Producto p2) {
		if(p1.getPrecio() > p2.getPrecio()) {
			return p1;
 		}else if(p2.getPrecio() >p1.getPrecio()) {
 			return p2;
 		}else {
 			return null;
 		}
	}
}
