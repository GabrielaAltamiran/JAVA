package com.krakedev.ejercio.logica;

import java.util.ArrayList;

import com.krakedev.ejercio.entidades.Alarma;

public class AdminAlarmas {
	ArrayList<Alarma> alarmas = new ArrayList<>();
	
	public void AgregarAlarma(Alarma alarma) {
		alarmas.add(alarma);
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
	

}
