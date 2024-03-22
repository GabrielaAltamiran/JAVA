package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telef = new Telefono("claro","0984654495",90);
		
		Contacto contac = new Contacto("Teran",telef,80.5);
		
			System.out.println("Apellido: "+contac.getApellido());
			System.out.println("Operado: "+contac.getTelefono().getOperadora());
			System.out.println("Numero: "+contac.getTelefono().getNumero());
			System.out.println("Peso: "+contac.getPeso());

	}

}
