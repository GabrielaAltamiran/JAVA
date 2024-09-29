package com.krakedev.ejercio.test;

import java.util.ArrayList;

import com.krakedev.ejercio.entidades.Alarma;
import com.krakedev.ejercio.logica.AdminAlarmas;
import com.krakedev.ejercio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		//INTANCIAR ALARMAS CON 
		Alarma al0=new Alarma (DiasSemana.LUNES, 3,45);
		Alarma al1=new Alarma (DiasSemana.MARTES, 2,55);
		Alarma al2=new Alarma (DiasSemana.MIERCOLES, 8,04);
		Alarma al3=new Alarma (DiasSemana.JUEVES, 3,15);
		Alarma al4=new Alarma (DiasSemana.VIERNES, 10,45);
		Alarma al5=new Alarma (DiasSemana.SABADO, 20,05);
		Alarma al6=new Alarma (DiasSemana.DOMINGO, 00,05);
		//AGREGAR ALARMAS
		AdminAlarmas adin = new AdminAlarmas();
		adin.AgregarAlarma(al0);
		adin.AgregarAlarma(al1);
		adin.AgregarAlarma(al2);
		adin.AgregarAlarma(al3);
		adin.AgregarAlarma(al4);
		adin.AgregarAlarma(al5);
		adin.AgregarAlarma(al6);
		//Agregar Alarmas
		ArrayList<Alarma>alarmasAcuales = adin.getAlarmas();
		System.out.println(alarmasAcuales);
	}

}
