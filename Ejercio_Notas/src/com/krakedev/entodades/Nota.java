package com.krakedev.entodades;

public class Nota {
	private Materia materia;
	private double calificacion;
	
	//---------------Metodod---------------
	public void mostrar() {
		System.out.println("Materia: "+materia.getCodigo());
		System.out.println("Calificacion: "+calificacion);
	}
	//---------------Get y Set

	public Materia getMaterias() {
		return materia;
	}

	public void setMaterias(Materia materias) {
		this.materia = materias;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
}
