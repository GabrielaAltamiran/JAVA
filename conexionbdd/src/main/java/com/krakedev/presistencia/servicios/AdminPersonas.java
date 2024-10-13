package com.krakedev.presistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.presistencia.entidades.Persona;
import com.krakedev.presitencia.utils.Conexionbdd;
public class AdminPersonas {
	private static final Logger LOGGER=LogManager.getLogger(AdminPersonas.class);
	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Persona a insertar>>>> "+persona);
		try {
			//Abrir conexion
			con = Conexionbdd.conectar();
			ps = con.prepareStatement("insert into personas(cedula,nombre,apellido,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento,codigo_estado_civil)"
							+ "values (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula()); // El insert en pgAdmin4 debe estar eliminado o no debe tener la misma llave pk
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setInt(4, persona.getNumero_hijos());
			ps.setDouble(5, persona.getEstatura());
			ps.setBigDecimal(6, persona.getCantidadAhorrada()); // Ayuda para cuando es una valor Money usamos "new BigDecimal(12098.98)"
			ps.setString(9, persona.getEstado_civil().getCodigo());
			ps.setDate(7, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(8, new Time(persona.getHora_nacimiento().getTime()));
			ps.executeUpdate();

		} catch (Exception e) { 
			LOGGER.error("Error al insertar",e);
			throw new Exception("Error al insertar");
			
		} finally {
			// CERRAR CONEXION
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				LOGGER.error("Error con la base de dato",e);
				throw new Exception("Error con la base de dato"); //Aqui va ya que no es solo "Exception" si no es "SQLException" y creamo una nueva.
			}
		}
	}
	//----------------------ACTUALIZAR------------------------------------

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Actualizar datos>>>> "+persona);
		try {
			con = Conexionbdd.conectar();
			ps = con.prepareStatement("update personas set nombre=?,apellido=?,numero_hijos=?,estatura=?,cantidad_ahorrada=?,fecha_nacimiento=?,hora_nacimiento=?,codigo_estado_civil=? where cedula=?");
			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setInt(3, persona.getNumero_hijos());
			ps.setDouble(4, persona.getEstatura());
			ps.setBigDecimal(5, persona.getCantidadAhorrada()); // Ayuda para cuando es una valor Money usamos "new BigDecimal(12098.98)"
			ps.setString(8, persona.getEstado_civil().getCodigo());
			ps.setDate(6, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(7, new Time(persona.getHora_nacimiento().getTime()));
			ps.setString(9, persona.getCedula()); 
			ps.executeUpdate();
			
		} catch (Exception e) {
			LOGGER.error("Error al actualizar datos",e);
			throw new Exception("Error al actualizar datos");
		}
	}
	//-------------------ELIMINAR-------------------------------------------
	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		LOGGER.trace("Eliminar persona>>>> "+cedula);
		try {
			con = Conexionbdd.conectar();
			ps = con.prepareStatement("delete from personas where cedula=?");
			ps.setString(1, cedula);
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
}
