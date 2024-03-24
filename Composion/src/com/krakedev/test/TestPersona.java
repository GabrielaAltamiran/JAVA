package com.krakedev.test;

import com.krakedev.composion.Direccion;
import com.krakedev.composion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		System.out.println("--------------------------------PERSONA 1----------------------------------------------");
		Persona p1 = new Persona();
		p1.setNombre("Gaby");
		p1.setApellido("Altamirano");
		Direccion dir = new Direccion();
		dir.setCallePrincipal("Cesar Endara");
		dir.setCalleSecunadaria("Balzar Carrion");
		dir.setNumero("N64.165");
		//----------------------------------------------
		p1.setDireccion(dir);
		//----------------------------------------------
		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();
		//----------------------------------------------
		System.out.println("Nombre: " + nombre);
		System.out.println(d1.getCallePrincipal());

		p1.imprimir();
		System.out.println("--------------------------------PERSONA 2----------------------------------------------");
		Persona p2 = new Persona();
		Direccion dir2 = new Direccion("Av Shyris", "6 de diciembre","A/N");
		p2.setNombre("Kevin");
		p2.setDireccion(dir2);
		
		p2.imprimir();
		System.out.println("--------------------------------PERSONA 3----------------------------------------------");
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("Eloy alfaro","Iñaquito","N75-205"));
		p3.imprimir();
		System.out.println("----");
		System.out.println("Fin");

	}

}
