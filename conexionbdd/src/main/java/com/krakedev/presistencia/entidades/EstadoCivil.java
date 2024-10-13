package com.krakedev.presistencia.entidades;

public class EstadoCivil {
	private String codigo;
	private String descripcipn;
	
	
	//Constructor vacio
	public EstadoCivil() {
		
	}
	//Constructor con parametros
	public EstadoCivil(String codigo, String descripcipn) {
		super();
		this.codigo = codigo;
		this.descripcipn = descripcipn;
	}
	//get y set
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcipn() {
		return descripcipn;
	}
	public void setDescripcipn(String descripcipn) {
		this.descripcipn = descripcipn;
	}
	@Override
	public String toString() {
		return "EstadoCivil [codigo=" + codigo + ", descripcipn=" + descripcipn + "]";
	}
	
	
	
}
