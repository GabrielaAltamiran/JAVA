package com.krakedev.presistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.presistencia.entidades.Persona;
import com.krakedev.presistencia.entidades.Transacciones;
import com.krakedev.presitencia.utils.Conexionbdd;

public class AdminTransacciones {
	private static final Logger LOGGER = LogManager.getLogger(AdminTransacciones.class);

	public static void insertar(Transacciones transaccion) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Transaccion a insertar>>>> " + transaccion);
		try {
			// ABRIR CONEXION
			con = Conexionbdd.conectar();
			ps = con.prepareStatement(
					"insert into transacciones(codigo,numero_cuenta,monto,tipo,fecha,hora)" + "values(?,?,?,?,?,?)");
			ps.setInt(1, transaccion.getCodigo());
			ps.setString(2, transaccion.getNumero_cuenta());
			ps.setBigDecimal(3, transaccion.getMonto());
			ps.setString(4, transaccion.getTipo());
			ps.setDate(5, new java.sql.Date(transaccion.getFecha().getTime()));
			ps.setTime(6, new Time(transaccion.getHora().getTime()));
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// CERRAR CONEXION
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de dato", e);
				throw new Exception("Error con la base de dato");
			}
		}
	}
	// ----------------------ACTUALIZAR------------------------------------

	public static void actualizar(Transacciones transaccion) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Actualizar transaccion >>>> " + transaccion);
		try {
			con = Conexionbdd.conectar();
			ps = con.prepareStatement(
					"update transacciones set numero_cuenta=?,monto=?,tipo=?,fecha=?,hora=? where codigo=?");
			ps.setString(1, transaccion.getNumero_cuenta());
			ps.setBigDecimal(2, transaccion.getMonto());
			ps.setString(3, transaccion.getTipo());
			ps.setDate(4, new java.sql.Date(transaccion.getFecha().getTime()));
			ps.setTime(5, new Time(transaccion.getHora().getTime()));
			ps.setInt(6, transaccion.getCodigo());
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al actualizar transaccion", e);
			throw new Exception("Error al actualizar datos");
		}
	}

	// ---------------------ELIMINAR--------------------------------------
	public static void eliminar(int codigo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Eliminar transaccion>>>> " + codigo);
		try {
			con = Conexionbdd.conectar();
			ps = con.prepareStatement("delete from transacciones where codigo=?");
			ps.setInt(1, codigo);
			ps.executeUpdate();

		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error enla base de datos", e);
				throw new Exception("Error en la base de datos");
			}
		}
	}

	// -------------------BUSQUEDAD QUE RETORNE REGISTROS POR CLAVE PRIMARIA
	// -------------------BUSQUEDAD QUE RETORNE REGISTROS CON CLAVE
	// PRIMARIA-------------------------

	public static Transacciones buscarPorcodigo(int codigo) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		ResultSet rs = null;
		Transacciones tr = null;
		try {
			con = Conexionbdd.conectar();
			ps = con.prepareStatement("select * from Transacciones  where codigo = ?");
			ps.setInt(1, codigo);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				tr = new Transacciones();
				tr.setCodigo(rs.getInt("codigo"));
				tr.setNumero_cuenta(rs.getString("numero_cuenta"));
				tr.setTipo(rs.getString("tipo"));
				tr.setFecha(rs.getDate("fecha"));
				tr.setHora(rs.getTime("hora"));

			}

		} catch (Exception e) {
			LOGGER.error("Error al buscar con codigo", e);
			throw new Exception("Error al buscar con codigo");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error enla base de datos", e);
				throw new Exception("Error en la base de datos");
			}
		}
		return tr;
	}
}
