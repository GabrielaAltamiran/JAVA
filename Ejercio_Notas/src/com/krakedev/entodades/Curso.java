package com.krakedev.entodades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiante;
	public String buscarEstudiantePorCedula(Estudiante estudiantes) {
		estudiante = new ArrayList<Estudiante>();
		Estudiante encontrado;
		String a=null;
		String cedulaBuscada = estudiantes.getCedula();
		for(int i=0;i<estudiante.size();i++) {
			encontrado = estudiante.get(i);
			if(encontrado!=null) {
				if(encontrado.getCedula().equals(cedulaBuscada)){
					a="Esta dentro del curso";	
				}
			}
		}
		return a ;
		
	}
	public void matricularEstudiante(Estudiante estudiantes) {
		String a =buscarEstudiantePorCedula(estudiantes);
		if(a ==null) {
			estudiante.add(estudiantes);
		}
	}
	//----------------------------------------
	public double calcularPromedioCurso() {
		
		double notaPormedio=0;
		double suma = 0;
		int totalEstuadiante = estudiante.size();
		if(totalEstuadiante>0) {
			for(int i=0;i<totalEstuadiante;i++){
				Estudiante nuevoEstudiante = estudiante.get(i);
				ArrayList<Nota> notasEstudiantes = nuevoEstudiante.getNotas();
				int totalMaterias = notasEstudiantes.size();
				if(totalMaterias>0) {
					for(int e=0;e<totalMaterias;e++) {
						Nota nota = notasEstudiantes.get(e);
						suma+= nota.getCalificacion();
					}
					double promedioEstudiante=suma/totalMaterias;
					notaPormedio+=promedioEstudiante;
					
				}
			}
			return notaPormedio/totalEstuadiante;
		}else {
			return 0;
		}
	}
	//------------------------------------------------
	public void mostrar() {
		estudiante = new ArrayList<Estudiante>();
		Estudiante encontrado=null;
		for(int i=0;i<estudiante.size();i++) {
			encontrado = estudiante.get(i);
			if(estudiante !=null) {
				System.out.println("Nombre:"+encontrado.getNombre()+" Apelldio:"+encontrado.getApellido()+" cedula:"+encontrado.getCedula());
			}else{
				System.out.println("No hay estuadiantes");
			}
		}
	}
	
	public ArrayList<Estudiante> getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(ArrayList<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}

	
}
