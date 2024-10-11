package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		// Clase--- Date-Java.util.Date
		// Clase--- Date-Java.sql.Date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechastr = "2024/07/29 10:39:32";
		try {
			// Date de java util
			Date fecha = sdf.parse(fechastr);
			System.out.println(fecha);
			System.out.println("------------");

			long fechaMili = fecha.getTime();
			System.out.println(fechaMili);

			System.out.println("------------");
			// Date de java sql
			// Crea un java.sql.Date, pariendo de un java.util.Date
			java.sql.Date fechaSQL = new java.sql.Date(fechaMili); // Se escribe la clase con el paquete y alli se
			// distinge con el date de java util
			System.out.println(fechaSQL);
			System.out.println("------------");
			// HOra
			Time timeSQL = new Time(fechaMili);
			System.out.println(timeSQL);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
