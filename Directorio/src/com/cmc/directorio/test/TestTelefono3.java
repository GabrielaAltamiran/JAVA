package com.cmc.directorio.test;


import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;


public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf=new Telefono("movi","09941234123",10);
		AdminTelefono adminTelefono=new AdminTelefono();
		adminTelefono.activarMensajeria(telf);
		telf.setCodigo(20);
		telf.setNumero("09941234123");
		telf.setOperadora("Movi");
		System.out.println("Operadora: "+telf.getOperadora());
		System.out.println("Telefono: "+telf.getNumero());
		System.out.println("Codigo: "+telf.getCodigo());
		System.out.println("Tiene WhatsApp: "+telf.isTieneWhatsApp());
		//*----------------------------------------------------------
		Telefono telf1=new Telefono("movi","09941234123",10);
		Telefono telf2=new Telefono("movi","09941234123",10);
		Telefono telf3=new Telefono("claro","09941234123",80);
		
		int contarOperadoraMovi = adminTelefono.contarMovi(telf1, telf2, telf3);
		System.out.println("Telefonos con la operadora movi son: "+contarOperadoraMovi);
		
	}

}
