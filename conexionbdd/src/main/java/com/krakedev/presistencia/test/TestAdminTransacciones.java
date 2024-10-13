package com.krakedev.presistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.presistencia.entidades.Transacciones;
import com.krakedev.presistencia.servicios.AdminTransacciones;
import com.krakedev.presitencia.utils.Convertidor;

public class TestAdminTransacciones {

	public static void main(String[] args) {
		Transacciones t = new Transacciones(29, "23198", new BigDecimal(2345.98), "C");
		try {
			Date fechaDate = Convertidor.convertirFecha(" 2024/07/26");
			Date horaDate = Convertidor.convertiHora(" 20:34:05");
			
			t.setHora(horaDate);
			t.setFecha(fechaDate);
			AdminTransacciones.insertar(t);

		} catch (Exception e) {			
			System.out.println("Error en el sistema: "+e.getMessage());
			
		}

	}

}
