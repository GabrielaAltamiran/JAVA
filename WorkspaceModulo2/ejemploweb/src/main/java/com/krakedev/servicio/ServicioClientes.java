package com.krakedev.servicio;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
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
	
	@Path("buscar")
	@GET
	@Produces(MediaType.APPLICATION_JSON) //ESPECIFICAR COMO QUIERO QUE REGRESE
	public Cliente buscar() {
		Cliente cli = new Cliente("1755841002","karen");
		return cli;
		
	}
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertar(Cliente cliente) {
		System.out.println(">>>>>>>>>>>> "+cliente);
		ClientesBDD clit = new ClientesBDD();
		try {
			clit.insertar(cliente);
			return Response.ok().build();
		} catch (Karakedevexception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	@Path("Actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualizarCliente(Cliente cliente) {
		System.out.println("Actualidando Cliente>>>>>>>>>>>> "+cliente);
		ClientesBDD clienteAct = new ClientesBDD();
		try {
			clienteAct.actualizar(cliente);
			return Response.ok().build();
		} catch (Karakedevexception e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	
	
	
	
	
}
