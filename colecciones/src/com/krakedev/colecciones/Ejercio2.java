package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas;
		personas = new ArrayList<>();

		personas.add(new Persona("Kevin","Teran"));
		personas.add(new Persona("Gaby","Altamirano"));
		personas.add(new Persona("Wendy","Tubay"));
		
		Persona elementoPersona;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			System.out.println(elementoPersona.getNombre()+"-"+elementoPersona.getApellido());
		}
		
		
	}

}
