package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// Instanciar
		Telefono telf = new Telefono("claro", "0984654995", 35);
		Contacto c = new Contacto("Altamirano", telf, 58.2);
		System.out.println("Nombre : " + c.getApellido() + " " + "operadora: " + c.getTelefono().getOperadora()
				+ " Telefono:  " + c.getTelefono().getNumero() + " Peso: " + c.getPeso());

	}

}
