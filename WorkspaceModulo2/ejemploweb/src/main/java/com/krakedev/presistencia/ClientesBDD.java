package com.krakedev.presistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.Karakedevexception;
import com.krakedev.utils.conexionbdd;

public class ClientesBDD {
	public void insertar(Cliente cliente) throws Karakedevexception {
		Connection con = null;
		try {
			con=conexionbdd.obtenerConexion();
			PreparedStatement ps= 
			con.prepareStatement("insert into clientes (cedula,nombre,numeroHijos) values (?,?,?)");
			ps.setString(1, cliente.getCedula());
			ps.setString(2, cliente.getNombre());
			ps.setInt(3, cliente.getNumero_Hijos());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Karakedevexception("Error al insertar cliente");
		} catch (Karakedevexception e) {
			throw e;
		}
		
	}
	public void actualizar (Cliente clit) throws Karakedevexception {
		Connection con = null;
		try {
			con=conexionbdd.obtenerConexion();
			PreparedStatement ps= con.prepareStatement("update clientes set nombre = ?, numeroHijos = ? where cedula = ?");
			ps.setString(1, clit.getNombre());
			ps.setInt(2, clit.getNumero_Hijos());
			ps.setString(3,clit.getCedula());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Karakedevexception("Error al actualizar cliente");
		} catch (Karakedevexception e) {
			
		}
		
	}
}
