package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","09941234123",10);
		AdminTelefono at=new AdminTelefono();
		at.activarMensajeria(telf);
		telf.setCodigo(20);
		telf.setNumero("09941234123");
		telf.setOperadora("Movi");
		System.out.println("Operadora: "+telf.getOperadora());
		System.out.println("Telefono: "+telf.getNumero());
		System.out.println("Codigo: "+telf.getCodigo());
		System.out.println("Tiene WhatsApp: "+telf.isTieneWhatsApp());

	}

}
