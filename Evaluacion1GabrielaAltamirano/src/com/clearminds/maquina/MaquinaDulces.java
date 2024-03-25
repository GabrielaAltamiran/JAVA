package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<>();
	}

	// ---------------------------METODOS-------------------------------------
	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		Celda elemetoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elemetoCelda = celdas.get(i);
			System.out.println("Celda " + (i + 1) + " " + elemetoCelda.getCodigo());
			// ---------------------------------------------------------------------------------------------------

		}

	}
	// -------------------------------Metodo buscarCelda-------------------

	public Celda buscarCelda(String codigo) {
		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codigo.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}

	
	
	
	// -------------------------------Metodo cargarProducto-------------------

	public void cargarProducto(Producto producto, String codigoCelda, int intems) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, intems);
		}
	}

	// ------------------------Metodo mostrarProducto-------------------------
	public void mostrarProductos() {
		Celda elemetoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elemetoCelda = celdas.get(i);
			if (elemetoCelda.getProducto() != null) {
				System.out.println("");
				System.out.println("Celda: " + elemetoCelda.getCodigo() + " " + "Stcok: " + elemetoCelda.getStock()
						+ " " + "Nombre: " + elemetoCelda.getProducto().getNombre() + " "
						+ elemetoCelda.getProducto().getPrecio());
				System.out.println("");

			} else {
				System.out.println("Celda: " + elemetoCelda.getCodigo() + " " + "Stcok: " + elemetoCelda.getStock()
						+ " " + "Sin producto asignado");
			}
		}
		System.out.println("Saldo maquina: " + saldo);

	}
	// -------------------------------Metodo buscarProductoEnCelda------------------
	public Producto buscarProductoEnCelda(String celda ) {
		Celda buscandoCelda=buscarCelda(celda);
		if(buscandoCelda != null) {
			Producto productoDeLaCelda = buscandoCelda.getProducto();
			return productoDeLaCelda;
		}else {
			return null;
		}
	}
	public double consultarPrecio(String codigo) {
		Celda elemetoCelda;
		double precio = 0;
		for (int i = 0; i < celdas.size(); i++) {
			elemetoCelda = celdas.get(i);
			if (elemetoCelda.getProducto() != null && elemetoCelda.getCodigo().equals(codigo)) {
				precio= elemetoCelda.getProducto().getPrecio();
			}
		}
		return precio;
		
	}
	//---------------------------Metodo  buscarCeldaProducto-----------------------
	public Celda buscarCeldaProducto(String codigoProducto) {
		Celda elemetoCodigoProducto=null;
		Celda codigoProductoEncontrado=null;
		for(int i =0; i<celdas.size();i++) {
			elemetoCodigoProducto=celdas.get(i);
			if(elemetoCodigoProducto != null && elemetoCodigoProducto.getProducto() != null && codigoProducto.equals(elemetoCodigoProducto.getProducto().getCodigo())){
				codigoProductoEncontrado=elemetoCodigoProducto;
			}
		}
		return codigoProductoEncontrado;
	}
	//----------------------------Metodo incrementarProductos---------------------
	public void incrementarProductos(String codigoProducto,int intems) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		int incremento = celdaEncontrada.getStock()+intems;
		celdaEncontrada.setStock(incremento);
	}
	//----------------------------Vender------------------------------------------
	public void vender(String codCel) {
		Celda celdaEncontrada=buscarCelda(codCel);
		if(celdaEncontrada != null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
			double precio = celdaEncontrada.getProducto().getPrecio();
			saldo += precio;
			mostrarProductos();
		}
	}
	public double venderConCambio(String codigoCelda,double valorIngresado) {
		Celda celdaEncontrada=buscarCelda(codigoCelda);
		double cambio = 0;
		if(celdaEncontrada !=null) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
			double precio = celdaEncontrada.getProducto().getPrecio();
			saldo += precio;
			cambio =(valorIngresado-precio);
		}
		
		return cambio ;
	}
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> menores = new ArrayList<Producto>();
		Celda elementoCelda = null;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			if(elementoCelda.getProducto().getPrecio() <= limite) {
				menores.add(elementoCelda.getProducto());
			}
		}
		return menores;
		
	}
	
	
	
	
	
	
	
}