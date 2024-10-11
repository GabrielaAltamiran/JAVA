package com.krakedev.excepciones;

public class ejercio1 {

	public static void main(String[] args) {
		System.out.println("------------");
		System.out.println("Inicio");
		System.out.println("------------");
		String a = "xxx34";
		try {
			System.out.println("ABRE LA CONEXION BDD");
			System.out.println("------------"); 
			a.substring(3);
			System.out.println("Fin");
			System.out.println("------------");
		}catch(Exception ex) {
			System.out.println("Entra al catch");
			System.out.println("------------");
		}finally {
			System.out.println("Entra a finally");
			System.out.println("------------");
			System.out.println("Cierra LA CONEXION BDD");
			System.out.println("------------");
		}
		System.out.println("Fuera del catch");
		System.out.println("------------");
	

	}

}
