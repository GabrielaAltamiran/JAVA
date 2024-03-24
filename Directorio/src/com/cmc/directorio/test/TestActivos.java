package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;
import com.cmc.directorio.entidades.AdminContactos;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telef = new Telefono("claro","0984654495",90);
		Contacto sinWhatt = new Contacto("Anzules",telef,85.2);
		System.out.println("Tiene whattsApp: "+telef.isTieneWhatsApp());
		AdminContactos cont = new AdminContactos();
		cont.activarUsuario(sinWhatt);
		System.out.println("Contacto: "+sinWhatt.getApellido()+" "+sinWhatt.getPeso()+" "+sinWhatt.getTelefono().getOperadora()+" "+sinWhatt.getTelefono().getCodigo());
		

	}

}
