package com.krakedev.demo.test;

import com.krakedev.demo.Prudcto;

public class testProducto {

	public static void main(String[] args) {
		Prudcto producto = new Prudcto(805479, "Harina");
		//------------------------------------------------
		Prudcto Descripcion = new Prudcto("La mejor de la ciudad");
		Descripcion.setDescripcion("Al mejor precio");
		//------------------------------------------------------
		Prudcto peso = new Prudcto("35");
		peso.setPeso(45.26);
		//----------------------------------------------
		System.out.println("---------------------VALORES INICIALES------------------------");
		System.out.println("Codigo: "+producto.getCodigo());
		System.out.println("Nombre: "+producto.getNombre());
		System.out.println("Descipcion: "+Descripcion.getDescripcion());
		System.out.println("Su peso: "+peso.getPeso());
		System.out.println("---------------------VALORES MODIFICADO-----------------------");
		System.out.println("Codigo: "+producto.getCodigo());
		System.out.println("Nombre: "+producto.getNombre());
		Descripcion.setDescripcion("La vida es mas linda con blanco");
		peso.setPeso(25.3);
		System.out.println("Descipcion: "+Descripcion.getDescripcion());
		System.out.println("Su peso modificado: "+peso.getPeso());
		
		
				
	}
}