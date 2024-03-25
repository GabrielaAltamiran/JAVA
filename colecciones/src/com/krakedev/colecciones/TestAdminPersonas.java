package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Gaby","Altamirano",17));
		admin.agregar(new Persona("Kevin","Teran",90));
		admin.agregar(new Persona("Josue","Rojas",85));
		admin.imprimir();
		Persona p1 = admin.buscarPorNombre("Gisel");
		if(p1!=null) {
			System.out.println("Econtrado: "+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("No exite la persona con ese nombre");
		}
		ArrayList<Persona> personasMayores=admin.buscarMayores(15);
		System.out.println("Mayores: "+personasMayores.size());
		
	}

}
