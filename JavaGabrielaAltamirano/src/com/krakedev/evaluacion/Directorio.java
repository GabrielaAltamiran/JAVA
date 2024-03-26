package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private String ultimaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		this.contactos = new ArrayList<>();
		this.correctos= new ArrayList<>();
		this.incorrectos= new ArrayList<>();
	}

	// ---------------------Metodo consultarUltimaModificacion---------------
	public String consultarUltimaModificacion() {
		return ultimaModificacion;
	}

	// --------------metodo agregarContacto--------------
	public boolean agregarContacto(Contacto contacto) {
		Contacto exiteCedula = buscarPorCedula(contacto.getCedula());
		if (exiteCedula != null) {
			return false;
		} else {
			contactos.add(contacto);
			Date fechaActual = new Date();
			SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY/MM/dd  HH:mm:ss");
			String fechaFormateada = formatoFecha.format(fechaActual);
			ultimaModificacion = fechaFormateada;
			return true;
		}

	}

	// ------------------Metodo contarPerdidos-----------
	public int contarPerdidos() {
		Contacto elementoContacto;
		int conteo = 0;
		for (int i = 0; i < contactos.size(); i++) {
			elementoContacto = contactos.get(i);
			if (elementoContacto.getDireccion() == null) {
				conteo = conteo + 1;
			}
		}
		return conteo;

	}

	// Metodo buscar por cedula
	public Contacto buscarPorCedula(String cedula) {
		Contacto elementoCedula;
		Contacto cedulaBusquedad = null;
		for (int i = 0; i < contactos.size(); i++) {
			elementoCedula = contactos.get(i);
			if (elementoCedula != null && elementoCedula.getCedula().equals(cedula)) {
				cedulaBusquedad = elementoCedula;
			} else {
				cedulaBusquedad = null;
			}
		}
		return cedulaBusquedad;

	}

	// -----------------------Metodo contarFijo----------------
	public int contarFijos() {
		int conteoFijos = 0;
		Contacto elementoFijo;
		Telefono elementoTelefono;
		for (int i = 0; i < contactos.size(); i++) {
			elementoFijo = contactos.get(i);
			ArrayList<Telefono> telefonos = elementoFijo.getTelefonos();
			for (int x = 0; x < telefonos.size(); x++) {
				elementoTelefono = telefonos.get(x);
				if (elementoTelefono != null && elementoTelefono.getTipo().equals("Convencional")
						&& elementoTelefono.getEstado().equals("C")) {
					conteoFijos = conteoFijos + 1;
				}
			}
		}

		return conteoFijos;

	}
	//------------------------Metodo depurar----------------
	public void depurar() {
		Contacto listaContacto;
		for(int i=0;i<contactos.size();i++) {
			listaContacto=contactos.get(i);
			if(listaContacto != null && listaContacto.getDireccion()!= null) {
				correctos.add(listaContacto);
			}else {
				incorrectos.add(listaContacto);
			}
		}
		contactos.clear();
	}

	
	//GEY SET 

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	
	
}
