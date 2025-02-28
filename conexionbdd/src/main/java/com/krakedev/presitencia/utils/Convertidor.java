package com.krakedev.presitencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Convertidor {
	private static final String FORMATO_FECHA="yyyy/MM/dd";
	private static final String FORMATO_HORA="hh:mm:ss";
	private static final Logger LOGGER=LogManager.getLogger(Convertidor.class);
	//CONVERTIR FECHA
	public static Date convertirFecha(String fecha) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
		Date fechaDate=null;
		
		try {
			LOGGER.trace("Convirtiendo fecha: " +fecha);
			fechaDate=sdf.parse(fecha);
			LOGGER.trace("Fecha convertida: " +fechaDate);
		} catch (ParseException e) {
			LOGGER.trace("La fecha no tiene el formato correcto" + fecha, e);
			throw new Exception("La fecha no tiene el formato correcto" + fecha);
		}
		return fechaDate;
	}
	//CONVERTIR HORA
	public static Date convertiHora(String hora) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA );
		Date horaDate=null;
		try {
			horaDate= sdf.parse(hora);
		} catch (ParseException e) {
			LOGGER.error("La hora no tiene el formato correcto" + hora, e);
			throw new Exception("La hora no tiene el formato correcto" + hora);
		}
		return horaDate;
	}
}
