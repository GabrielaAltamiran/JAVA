package com.krakedev.ejercio.utils;

public class Util {
	public static String formatearHora(int hora) {
		String valor = hora+"";
		if (valor.length() == 1) {
			return "0" + valor;
		}
		return valor;
	}
	public static String formatearDia(int dia) {
		if(dia == 0) {
			return "LUNES";
		}if(dia == 1){
			return "MARTES";
		}if(dia == 2) {
			return "MIERCOLES";
		}if(dia == 3) {
			return "JUEVES";
		}if(dia == 4) {
			return "VIERNES";
		}if(dia == 5) {
			return "SABADO";
		}if (dia == 6) {
			return "DOMINGO";
		}
		return "DIA NO EXITE";
		
		
	}
}
