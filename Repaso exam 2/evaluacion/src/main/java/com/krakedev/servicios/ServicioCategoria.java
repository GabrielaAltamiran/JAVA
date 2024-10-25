package com.krakedev.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.evaluacion.entidades.Categoria;
import com.krakedev.evaluacion.excepciones.KrakeException;
import com.krakedev.evaluacion.presistencia.HistorialBdd;

@Path ("categoria")
public class ServicioCategoria {
	// -----------------------------INSERTAR--------------------------
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Categoria cat) {
		System.out.println("Insertando>>>>>>>>>>>> " + cat);
		HistorialBdd his = new HistorialBdd();
		try {
			his.insertar(cat);
			return Response.ok().build();
		} catch (KrakeException e) {
			
			e.printStackTrace();
			return Response.serverError().build();
		}
		
	}
//------------------------------ACTUALIZAR-----------------
	@Path("Actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizar(Categoria cat){
		System.out.println("Actualidando >>>>>>>>>>> " + cat);
		HistorialBdd his = new HistorialBdd();
		try {
			his.actualizar(cat);
			return Response.ok().build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	//-----------------------------BUSCAR POR ID----------------
	@Path("BuscarPorId/{idParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response BuscarPorId(@PathParam("idParam")int id) {
		
		HistorialBdd his = new HistorialBdd();
		Categoria cat = null;
		try {
			cat = his.buscarPorId(id);
			return Response.ok(cat).build();
		} catch (KrakeException e) {
			e.printStackTrace();//NO ELIMINARRRRR
			return Response.serverError().build();
		
		}
		
	}
	//-----------------------------RECUPERAR CATEGORIAS-------------------
	@Path("Recuperar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response recuperarTodoCategoria() {
		HistorialBdd his = new HistorialBdd();
		ArrayList<Categoria> cat = null;
		try {
			cat = his.recuperarTodo();
			return Response.ok(cat).build();
		} catch (KrakeException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
		
	}
	
	
}
