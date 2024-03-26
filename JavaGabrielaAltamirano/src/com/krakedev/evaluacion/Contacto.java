package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	//-------------------------CONSTRUCTOR---------------------------
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<>();
	}
	//----------------------GET Y SET--------------------------------
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
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
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	//--------------------METODO IMPRIMIR---------------------------
	public void imprimir() {
		System.out.println("Informacion del contacto: ");
		System.out.println("Cedula: "+cedula);
		System.out.println("Nombre: "+nombre+" "+apellido);
		System.out.println("Direccion: ");
		System.out.println(" "+"Calle pribcipal: "+direccion.getCallePrincipal());
		System.out.println(" "+"Calle secundaria: "+direccion.getCalleSecundaria());
	}
	//-------------Metodo agregarTelefono-------------
	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}
	//------------Metodo mostrarTelefonos-------------
	
	public void mostrarTelefonos() {
		Telefono elemntoTelef;
		System.out.println("Telefonos con estado C:");
		for(int i=0;i<telefonos.size();i++) {
			elemntoTelef = telefonos.get(i);
			if(elemntoTelef!=null && elemntoTelef.getEstado().equals("C")) {
				System.out.println("Numero: "+elemntoTelef.getNumero()+ " , "+"Tipo: "+elemntoTelef.getTipo());
			}
		}
		
	}

	
	
	
	//-------------Metodo recuperarIncorrectos---------------
	public ArrayList<Telefono>  recuperarIncorrectos() {
		Telefono elemntoTelef;
		ArrayList<Telefono> telefonoE = new ArrayList<>();
		for(int i=0;i<telefonos.size();i++) {
			elemntoTelef = telefonos.get(i);
			if(elemntoTelef!=null && elemntoTelef.getEstado().equals("E")) {
				telefonoE.add(elemntoTelef);		
			}
		}
		return telefonoE;
		
	}
}
