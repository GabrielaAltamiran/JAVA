package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telf) {
		if (telf.getOperadora() == "movi") {
			telf.setTieneWhatsApp(true);
		}
	}

	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
		int contarMovi = 0;

		if (telf1.getOperadora() == "movi") {
			contarMovi = contarMovi + 1;
		}
		if (telf2.getOperadora() == "movi") {
			contarMovi = contarMovi + 1;
		}
		if (telf3.getOperadora() == "movi") {
			contarMovi = contarMovi + 1;
		}
		return contarMovi;

	}

	public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {

		int contarClaro = 0;

		if (telf1.getOperadora() == "claro") {
			contarClaro = contarClaro + 1;
		}
		if (telf2.getOperadora() == "claro") {
			contarClaro = contarClaro + 1;
		}
		if (telf3.getOperadora() == "claro") {
			contarClaro = contarClaro + 1;
		}
		if (telf4.getOperadora() == "claro") {
			contarClaro = contarClaro + 1;
		}
		return contarClaro;

	}

}
