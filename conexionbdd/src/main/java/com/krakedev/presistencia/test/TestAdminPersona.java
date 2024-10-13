package com.krakedev.presistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.presistencia.entidades.EstadoCivil;
import com.krakedev.presistencia.entidades.Persona;
import com.krakedev.presistencia.servicios.AdminPersonas;
import com.krakedev.presitencia.utils.Convertidor;
//System.out.println= SOLO SE VA PODER USAR EN LOS TEST
public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("1231540912","Karen","Mendez",ec);
		try {
			Date fechaDate = Convertidor.convertirFecha(" 2024/07/29");
			Date horaDate = Convertidor.convertiHora(" 23:43:05");
			
			p.setHora_nacimiento(horaDate);
			p.setFecha_nacimiento(fechaDate);
			p.setCantidadAhorrada(new BigDecimal(23455.98));
			p.setNumero_hijos(3);
			AdminPersonas.insertar(p);

		} catch (Exception e) {			
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	}

}
