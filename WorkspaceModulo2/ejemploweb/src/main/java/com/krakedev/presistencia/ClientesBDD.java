package com.krakedev.presistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.Karakedevexception;
import com.krakedev.utils.conexionbdd;

public class ClientesBDD {
	public void insertar(Cliente cliente) throws Karakedevexception {
		Connection con = null;
		try {
			con = conexionbdd.obtenerConexion();
			PreparedStatement ps = con
					.prepareStatement("insert into clientes (cedula,nombre,numeroHijos) values (?,?,?)");
			ps.setString(1, cliente.getCedula());
			ps.setString(2, cliente.getNombre());
			ps.setInt(3, cliente.getNumero_Hijos());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Karakedevexception("Error al insertar cliente. Detalle: " + e.getMessage());
		} catch (Karakedevexception e) {
			throw e;
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					throw new Karakedevexception("Error al consultar cliente. Detalle: " + e.getMessage());
				}
			}
		}

	}

	// --------------------------Acualizar-----------------------------
	public void actualizar(Cliente clit) throws Karakedevexception {
		Connection con = null;
		try {
			con = conexionbdd.obtenerConexion();
			PreparedStatement ps = con
					.prepareStatement("update clientes set nombre = ?, numeroHijos = ? where cedula = ?");
			ps.setString(1, clit.getNombre());
			ps.setInt(2, clit.getNumero_Hijos());
			ps.setString(3, clit.getCedula());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Karakedevexception("Error al actualizar cliente. Detalle: " + e.getMessage());
		} catch (Karakedevexception e) {
			throw e;

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

	// _----------------RECUPERAR INFORMACION-----------------
	public ArrayList<Cliente> recuperarTodo() throws Karakedevexception {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente clit = null;
		try {
			con = conexionbdd.obtenerConexion();
			ps = con.prepareStatement("SELECT cedula, nombre, numeroHijos FROM clientes");
			rs = ps.executeQuery();
			while (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numeroHijos");
				clit = new Cliente(cedula, nombre, numeroHijos);
				clientes.add(clit);

			}

		} catch (Karakedevexception e) {
			throw e;
		} catch (SQLException e) {

			throw new Karakedevexception("Error al consultar. Detalle: " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return clientes;
	}

	// _----------------BUSCAR POR CLAVE PRIMARIA-----------------
	public Cliente buscarPorClavePK(String cedulaBusqueda) throws Karakedevexception {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Cliente clit = null;
		try {
			con = conexionbdd.obtenerConexion();
			ps = con.prepareStatement("SELECT cedula, nombre, numeroHijos FROM clientes where cedula = ?");
			ps.setString(1, cedulaBusqueda);
			rs = ps.executeQuery();

			if (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos = rs.getInt("numeroHijos");
				clit = new Cliente(cedula, nombre, numeroHijos);
			}

		} catch (Karakedevexception e) {
			throw e;
		} catch (SQLException e) {

			throw new Karakedevexception("Error al buscar por pk. Detalle: " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return clit;
	}
	// _----------------BUSCAR Por numero hijos-----------------

	public ArrayList<Cliente> buscarPorNumeroHijos(int numeroHijos) throws Karakedevexception {
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = conexionbdd.obtenerConexion();
			ps = con.prepareStatement("SELECT cedula, nombre, numeroHijos FROM clientes where numeroHijos >=?");
			ps.setInt(1, numeroHijos);
			rs = ps.executeQuery();
			Cliente clit = null;
			while (rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				int numeroHijos1 = rs.getInt("numeroHijos");
				clit = new Cliente(cedula, nombre, numeroHijos1);
				clientes.add(clit);
			}
		} catch (Karakedevexception e) {
			throw e;
		} catch (SQLException e) {

			throw new Karakedevexception("Error al buscar por numero de hijos . Detalle: " + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return clientes;

	}

}
