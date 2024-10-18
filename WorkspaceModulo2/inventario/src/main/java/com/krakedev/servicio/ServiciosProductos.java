package com.krakedev.servicio;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.inventario.entidades.Categoria;
import com.krakedev.inventario.entidades.Producto;

@Path("productos")
public class ServiciosProductos {
	//--------------------------------------------//
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	
	public void insertar(Producto pro) {
		System.out.println("Producto>>>>>> " + pro);
	}
	//--------------------------------------------//
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	
	public void actualizar(Producto prod) {
		System.out.println("Actualizar>>>>>> " + prod);
	}
	//--------------------------------------------//
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public static ArrayList<Producto> recuperarTodos(){
		Categoria cat1=new Categoria(1, "Panaderia");
		Categoria cat2=new Categoria(2, "Golosinas");
		Categoria cat3=new Categoria(3, "Medicina");
		
		ArrayList<Producto> productos = new ArrayList<Producto>();
		new Producto("00002","Pan de chocolate",cat1,1.00,23);
		new Producto("00065","Gomitas de sandia",cat2,0.65,5);
		new Producto("00123","Electrolitos",cat3,4.65,54);
		//SE AGREGA A LA LISTA
		productos.add(new Producto("00002","Pan de chocolate",cat1,1.00,23));
		productos.add(new Producto("00065","Gomitas de sandia",cat2,0.65,5));
		productos.add(new Producto("00123","Electrolitos",cat3,4.65,54));
		
		System.out.println(">>>>>>>>>>>" + productos);
		return productos;
		
	}
}
