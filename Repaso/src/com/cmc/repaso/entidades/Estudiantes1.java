package com.cmc.repaso.entidades;

public class Estudiantes1 {
	private String nombre; 
	private double nota;
	//.--------------------------------------	
	public String getNombre() {
		return nombre;
	}
	//.--------------------------------------

	public double getNota() {
		return nota;
	}
	//.--------------------------------------
	public void setNota(double nota) {
		this.nota = nota;
	}
	//-----------------------------------------
	public Estudiantes1(double nota){
		this.nota=nota;
	}
	//-----------------------------------------
	public Estudiantes1(String nombre) {
		this.nombre=nombre;
	
	}
	public void calificar(double nota) {
		this.nota=nota;
		if (nota <8) {
			System.out.println("Resultado: F");
		}else if(nota >= 8) {
			System.out.println("Resultado: A");
		}else {      
			System.out.println("Respuesta incorrecta");
		}
	}
}

