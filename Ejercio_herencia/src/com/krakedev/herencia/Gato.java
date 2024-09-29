package com.krakedev.herencia;

public class Gato extends Animal {
	@Override
	public void dormir() {
		System.out.println("Solo durme por las noches");
	}
	public void maullar() {
		System.out.println("El gato maulla en la asotea viendo la luna");
	}
	public void maullar(String adjetivo) {
		System.out.println("El gato maulla en la asotea viendo la luna" + " " + adjetivo);
	}
}
