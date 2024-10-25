package com.krakedev.evaluacion.entidades;

import java.util.Date;

public class HistorialMovimineto {
	private int id;
	private int id_producto;
	private int cantidad;
	private Date fechaMovimineto;

	// CONSTRUCTOR VACIO
	public HistorialMovimineto() {

	}

	// CONSTRUCTOR CON PARAMETROS
	public HistorialMovimineto(int id, int id_producto, int cantidad, Date fechaMovimineto) {
		super();
		this.id = id;
		this.id_producto = id_producto;
		this.cantidad = cantidad;
		this.fechaMovimineto = fechaMovimineto;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "HistorialMovimineto [id=" + id + ", id_producto=" + id_producto + ", cantidad=" + cantidad
				+ ", fechaMovimineto=" + fechaMovimineto + "]";
	}

	// GET Y SET
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Date getFechaMovimineto() {
		return fechaMovimineto;
	}

	public void setFechaMovimineto(Date fechaMovimineto) {
		this.fechaMovimineto = fechaMovimineto;
	}

}
