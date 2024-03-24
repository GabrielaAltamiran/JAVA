package com.cmc.directorio.test;


import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("movi","0245796813",20);
	
		Contacto contac = new Contacto("Altamirano",telef,25.1);
		
			System.out.println("Apellido: "+contac.getApellido());
			System.out.println("Operado: "+contac.getTelefono().getOperadora());
			System.out.println("Numero: "+contac.getTelefono().getNumero());
			System.out.println("Peso: "+contac.getPeso());
	}

}
