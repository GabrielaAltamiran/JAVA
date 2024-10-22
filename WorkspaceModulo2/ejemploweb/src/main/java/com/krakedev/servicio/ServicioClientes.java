package com.krakedev.servicio;

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

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.Karakedevexception;
import com.krakedev.presistencia.ClientesBDD;

@Path("clientes")

public class ServicioClientes {
	@Path("metodo1")
	@GET

	public String saludar() {
		return "Hola mundo Rest Web Services";

	}

	// -----------------------------BUSCAR--------------------------
	@Path("buscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON) // ESPECIFICAR COMO QUIERO QUE REGRESE
	public Cliente buscar() {
		Cliente cli = new Cliente("1755841002", "karen", 3);
		return cli;

	}

	// -----------------------------INSERTAR--------------------------
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Cliente cliente) {
		System.out.println(">>>>>>>>>>>> " + cliente);
		ClientesBDD clit = new ClientesBDD();
		try {
			clit.insertar(cliente);
			return Response.ok().build();
		} catch (Karakedevexception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	// -----------------------------ACTUALIZAR------------------------------
	@Path("Actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON) // CONSUMES SE USA PARA CUANDO VOY A RECIBIR ALGO
	public Response actualizarCliente(Cliente cliente) {
		System.out.println("Actualidando Cliente>>>>>>>>>>>> " + cliente);
		ClientesBDD clienteAct = new ClientesBDD();
		try {
			clienteAct.actualizar(cliente);
			return Response.ok(clienteAct).build();
		} catch (Karakedevexception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}

	// -----------------------------OBTENERCLIENTES--------------------------
	@Path("all")
	@GET
	@Produces(MediaType.APPLICATION_JSON) // PRODUCES ES PARA CUANDO ME VA A DEVOLVER ALGO

	public Response obtenerClientes() {
		ClientesBDD clienteObtenido = new ClientesBDD();
		ArrayList<Cliente> clientes = null;
		try {
			clientes = clienteObtenido.recuperarTodo();
			return Response.ok(clientes).build();
		} catch (Karakedevexception e) {
			return Response.serverError().build();
		}
	}

	// --------------------BUSCAR POR CLAVE PRIMARIA--------------------
	@Path("BuscarPorCedula/{cedulaParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON) // PRODUCES ES PARA CUANDO ME VA A DEVOLVER ALGO

	public Response BuscarPorCedula(@PathParam("cedulaParam") String cedula) { // SE COOCA EL @PATHPARAM PARA RECUPERAR
																				// EL VALOR DE CEULA QUE ESTA EN LA
																				// LLAVES DEL PATH Y SE VA ASIGNAR
																				// DIRECTAMENTE EN EL APRAMETRO CEDULA
																				// DE LA FUNCION
		ClientesBDD cli = new ClientesBDD();
		Cliente cliente = null;
		try {
			cliente = cli.buscarPorClavePK(cedula);
			return Response.ok(cliente).build();
		} catch (Karakedevexception e) {
			return Response.serverError().build();
		}
	}
	//------------------------BUSCAR POR UMERO DE HIJOS---------------
	@Path("BuscarPorNumeroHijos/{numeroHijosParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON) // PRODUCES ES PARA CUANDO ME VA A DEVOLVER ALGO

	public Response obtenerPorNumeroDeHijos(@PathParam("numeroHijosParam") int numeroHijos) {
		ClientesBDD clienteObtenido = new ClientesBDD();
		ArrayList<Cliente> clientes = null;
		try {
			clientes = clienteObtenido.buscarPorNumeroHijos(numeroHijos);
			return Response.ok(clientes).build();
		} catch (Karakedevexception e) {
			return Response.serverError().build();
		}
	}

}
