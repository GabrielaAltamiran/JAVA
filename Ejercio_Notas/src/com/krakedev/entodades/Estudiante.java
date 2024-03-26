package com.krakedev.entodades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	
	
	
	public Estudiante(String nombre, String apellido, String cedula) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		notas = new ArrayList<Nota>();
		
	}
	public Estudiante() {
	}
	//---metodos------------
	public void agregarNota(Nota nuevaNota) {
		
		Nota encontrado;
		boolean notaExistente;
		double nota1 = nuevaNota.getCalificacion();
		String codigoMateria = nuevaNota.getMaterias().getNombre();
		if(nota1>=0 && nota1<=10) {
			notaExistente=false;
			for (int i=0;i<notas.size();i++) {
				encontrado = notas.get(i);
				if(encontrado.getMaterias().getNombre().equals(codigoMateria)) {
					notaExistente=true;
					break;
				}else {
					System.out.println("No encontro la nota");
				}
			}
			if(notaExistente==false) {
				notas.add(nuevaNota);
				System.out.println("Ya fue agregado correctamente");
			}
		}else {
			System.out.println("No entro al 1-10");
		}
	}
		
		
	
	public void modificaNota(Materia codigo,double nuevaNota) {
		Nota not = new Nota();
		Materia mat = new Materia();
		
		if(mat.getCodigo().equals(codigo.getCodigo())) {
			if(nuevaNota>=0 && nuevaNota<=10) {
				not.setCalificacion(nuevaNota);
			}
		}
		
	}
		
	public double calculaPromedioNotaEstudiante() {
		Nota encontrado;
		double suma = 0;
		double promedio;
		for(int i=0;i<notas.size();i++) {
			encontrado = notas.get(i);
			suma+=encontrado.getCalificacion();
		}
		promedio = suma/notas.size();
		return promedio;
	}
	public void mostrar() {
		notas = new ArrayList<Nota>();
		if(nombre !=null && apellido!=null && cedula!=null && notas!=null ) {
			System.out.println("Nombre:"+nombre+" Apelldio:"+apellido+" cedula:"+cedula);
		}
		for(int i=0;i<notas.size();i++) {
			System.out.println("Materia:"+notas.get(i).getMaterias().getNombre());
			
		}
	}
	//---------------
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
	
	
	


}
