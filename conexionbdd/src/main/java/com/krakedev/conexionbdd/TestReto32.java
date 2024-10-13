package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestReto32 {

	public static void main(String[] args) {
		Connection conection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			conection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/ejercios", "postgres",
					"gabriela29");
			System.out.println("Conexion exitosa");
			
			ps = conection.prepareStatement(
					"insert into personas(cedula,nombre,apellido,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento,codigo_estado_civil)"
							+ "values (?,?,?,?,?,?,?,?,?)");
			
			
			ps.setString(1, "1714616123"); // El insert en pgAdmin4 debe estar eliminado o no debe tener la misma llave
											// pk
			ps.setString(2, "Santiago");
			ps.setString(3, "Mosquera");
			ps.setInt(4, 2);
			ps.setDouble(5, 1.45);
			ps.setBigDecimal(6, new BigDecimal(12098.98)); // Ayuda para cuando es una valor Money usamos "new  BigDecimal(12098.98)"
			ps.setString(9, "U");
			
			
			
			System.out.println("-----------------------------");
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
				
				ps.setDate(7, fechaSQL);
				ps.setTime(8, timeSQL);
				
				System.out.println("-----------------------------");
				
				ps.executeUpdate();
				System.out.println("Ejecunta insert");

			} catch (ParseException e) {
				e.printStackTrace();
			}

			System.out.println("-----------------------------");
		

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}


}
