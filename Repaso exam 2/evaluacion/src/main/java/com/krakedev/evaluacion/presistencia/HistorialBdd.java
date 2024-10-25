package com.krakedev.evaluacion.presistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.utils.ConexionBDD;

public class HistorialBdd {
//-----------------------------INSERTAR-------------------------
	public void insertar(Categoria cat) throws KrakeException {
		Connection con = null;
		
		try {
			
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con.prepareStatement("insert into categoria values(?,?)");
			ps.setInt(1, cat.getId());
			ps.setString(2, cat.getNombre());
			ps.executeLargeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al insertar categoria: " + e.getMessage());

		} catch (KrakeException e) {
			throw e;

		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					throw new KrakeException("Error al insertar categoria: " + e.getMessage());
				}
			}

		}
	}
	//---------------------------ACTUALIZARR-------------------------
	public void actualizar (Categoria cat) throws KrakeException {
		Connection con = null;
		try {
			con = ConexionBDD.obtenerConexion();
			PreparedStatement ps = con.prepareStatement("update categoria set nombre=? where id=?");
			ps.setInt(2, cat.getId());
			ps.setString(1, cat.getNombre());
			ps.executeUpdate();
			
		} catch (KrakeException e) {
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al actualizar. Mas Detalle: "+e);
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	//--------------------------BUSCAR POR ID----------------------
	public  Categoria buscarPorId (int buscarid) throws KrakeException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		Categoria cat = null;
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("select id, nombre from categoria where id=?");
			ps.setInt(1, buscarid);
			rs=ps.executeQuery();
			if(rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				cat = new Categoria(id,nombre);
			}
			
		} catch (KrakeException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al buscar por id. Detalle>>>>> "+e);
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return cat;
	}
//-----------------------------RECUPERAR TODOS-----------------------------
	public ArrayList<Categoria> recuperarTodo() throws KrakeException{
		ArrayList<Categoria> cat = new ArrayList<Categoria>();
		Connection con=null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Categoria cat1 = null;
		try {
			con=ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select id,nombre from categoria");
			rs = ps.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombre = rs.getString("nombre");
				cat1 = new Categoria(id,nombre);
				cat.add(cat1);
			}
			
		} catch (KrakeException e) {
			throw e;
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeException("Error al recuperar informacion. Detalle>>>>>>>>>> "+e);
		
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return cat;
	}
	
	
}
