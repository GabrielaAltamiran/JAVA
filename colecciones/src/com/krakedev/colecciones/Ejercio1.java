package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercio1 {

	public static void main(String[] args) {
		ArrayList<String> cadenas;
		String valorRecuperado;
		cadenas = new ArrayList<String>();
		System.out.println(cadenas.size());
		//Se agrega dos elementos al arrayList
		cadenas.add("Kevin");//posion 0
		cadenas.add("Gaby");//posicioon1
		
		System.out.println(cadenas.size());
		//Se colocan desde el cero, para aceder hay que acceder al idice que me interesa 
		valorRecuperado = cadenas.get(0);
		System.out.println(valorRecuperado);
		String cadena;
		for(int i=0;i<cadenas.size();i++) {
			cadena=cadenas.get(i);
			System.out.println("Cadena "+cadena);
		}
	}

}
