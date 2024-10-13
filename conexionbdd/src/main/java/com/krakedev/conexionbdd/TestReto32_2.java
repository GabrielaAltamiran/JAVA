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

public class TestReto32_2 {

	public static void main(String[] args) {
		Connection conection = null;
		PreparedStatement ps = null;

		try {
			Class.forName("org.postgresql.Driver");
			conection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/ejercios", "postgres",
					"gabriela29");
			System.out.println("Conexion exitosa");
			
			ps = conection.prepareStatement(
					"insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)"
							+ "values (?,?,?,?,?,?)");
			ps.setInt(1, 56);
			ps.setString(2, "22187");
			ps.setBigDecimal(3, new BigDecimal(12345.98));
			ps.setString(4, "C");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechastr = "2020/02/29 23:29:02";
			
			
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
				
				ps.setDate(5, fechaSQL);
				ps.setTime(6, timeSQL);
				
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
