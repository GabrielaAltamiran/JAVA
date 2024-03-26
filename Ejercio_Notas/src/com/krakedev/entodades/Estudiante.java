package com.krakedev.entodades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	// ---------------Metodo---------------
	public void agregarNota(Nota nuevaNota) {
		Nota encontrado;
		boolean notaExiste;
		double nota1 = nuevaNota.getCalificacion();
		String codigoMateria = nuevaNota.getMaterias().getCodigo();
		if(nota1>=0 && nota1<=10) {
			notaExiste=false;
			for (int i=0;i<notas.size();i++) {
				encontrado = notas.get(i);
				if(encontrado.getMaterias().getCodigo().equals(codigoMateria)) {
					notaExiste=true;
					break;
				}else {
					System.out.println("No encontro la nota");
				}
			}
			if(notaExiste==false) {
				notas.add(nuevaNota);
				System.out.println("Ya fue agregado correctamente");
			}
		}else {
			System.out.println("No entro al 1-10");
		}
	}
	// ----------------------------------------------------

	public void modificaNota(Materia codigo,double nuevaNota) {
		Nota not = new Nota();
		Materia mat = new Materia();
		
		if(mat.getCodigo().equals(codigo.getCodigo())) {
			if(nuevaNota>=0 && nuevaNota<=10) {
				not.setCalificacion(nuevaNota);
			}
		}
		
	}
	

	// ------------------------------------------------
	public double calculaPromedioNotaEstudiante() {
		Nota encontrado;
		double suma = 0;
		double promedio;
		for (int i = 0; i < notas.size(); i++) {
			encontrado = notas.get(i);
			suma += encontrado.getCalificacion();
		}
		promedio = suma / notas.size();
		return promedio;
	
	}

	

//---------------------------------------------------------
	public void mostrar() {
		notas = new ArrayList<Nota>();
		if (nombre != null && apellido != null && cedula != null && notas != null) {
			System.out.println("Nombre:" + nombre + " Apelldio:" + apellido + " cedula:" + cedula);
		}
		for (int i = 0; i < notas.size(); i++) {
			System.out.println("Materia:" + notas.get(i).getMaterias().getNombre());

		}
	}

	// ----------------------------------------------------
	public static Estudiante buscarPorCedula(String cedula, ArrayList<Estudiante> listaEstudiantes) {
		for (Estudiante estudiante : listaEstudiantes) {
			if (estudiante.getCedula().equals(cedula)) {
				return estudiante; // Se encontró el estudiante
			}
		}
		return null; // No se encontró ningún estudiante con esa cédula
	}
	// -------------------------------------------------

//----------------------Gey y set----------------------------------
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


}
