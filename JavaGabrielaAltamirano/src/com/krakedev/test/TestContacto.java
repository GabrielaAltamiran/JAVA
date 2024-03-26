package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto {

	public static void main(String[] args) {
	    

        // Crear una instancia de Contacto
        Contacto contacto = new Contacto("1234567890", "Juan", "Pérez");
        Contacto contacto2 = new Contacto("9876513210", "Ana", "Gomez");
     // Settear la dirección
        Direccion Direccion = new Direccion("Av. siempre vida", "Calle 4");
        contacto.setDireccion(Direccion);
        
        // Settear la dirección
        
        Direccion Direccion1 = new Direccion("Cdl del ejercito", "Pasaje 2B");
        contacto2.setDireccion(Direccion1);


        // Mostrar información 
        System.out.println("\nInformación del Contacto:");
        contacto.imprimir();
        System.out.println("-------------------------------------");
        System.out.println("Informacion del Contacto(Actualizada)");
        contacto2.imprimir();
    }
}

