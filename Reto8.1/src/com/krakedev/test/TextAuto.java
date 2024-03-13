package com.krakedev.test;

import com.krakedev.Auto;

public class TextAuto {

	public static void main(String[] args) {
		Auto auto1=new Auto("AUDI",2003,1895.62);
		Auto auto2=new Auto("FIAT",2022,2900.62);
		Auto auto3=new Auto("CHEVROLET",2002,1500.62);
		
		System.out.println("------------------------------------------");
		System.out.println("La marca de su auto es "+auto1.getMarca());
		System.out.println("Su auto es del año "+auto1.getAnio());
		System.out.println("El costo de su auto es "+auto1.getPrecio());
		System.out.println("------------------------------------------");
		
		
		System.out.println("La marca de su auto es "+auto2.getMarca());
		System.out.println("Su auto es del año "+auto2.getAnio());
		System.out.println("El costo de su auto es "+auto2.getPrecio());
		System.out.println("------------------------------------------");
		
		
		System.out.println("La marca de su auto es "+auto3.getMarca());
		System.out.println("Su auto es del año "+auto3.getAnio());
		System.out.println("El costo de su auto es "+auto3.getPrecio());
		System.out.println("------------------------------------------");


	}

}
