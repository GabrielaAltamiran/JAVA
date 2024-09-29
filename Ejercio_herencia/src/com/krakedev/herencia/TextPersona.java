package com.krakedev.herencia;

public class TextPersona {

	public static void main(String[] args) {
		Cuenta c = new Cuenta("2234565193",238.98);
		System.out.println(c.toString());
		c.toString();
		Persona p = new Persona("Karen", "0924156288");
		System.out.println(p);

	}

}
