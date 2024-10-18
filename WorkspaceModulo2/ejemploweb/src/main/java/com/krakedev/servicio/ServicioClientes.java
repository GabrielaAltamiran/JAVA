package com.krakedev.servicio;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.entidades.Cliente;

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
	public void insertar(Cliente cliente) {
		System.out.println(">>>>>>>>>>>> "+cliente);
	}
	@Path("Actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizarCliente(Cliente cliente) {
		System.out.println("Actualidando Cliente>>>>>>>>>>>> "+cliente);
	}
	
	
	
	
	
	
}
