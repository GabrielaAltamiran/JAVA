package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMasPeso(Contacto c1,Contacto c2) {
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
		}else{
			return c2;
		}
	}
	public	boolean compararOpeeradora(Contacto contac1,Contacto contac2) {
		if(contac1.getTelefono().getOperadora()==contac2.getTelefono().getOperadora()) {
			return true;
		}else {
			return false;
		}
	}
	public  void activarUsuario(Contacto contacto) {
		if(contacto.getTelefono().isTieneWhatsApp()==true) {
			contacto.setActivo(true);
			
		}
	}
}
