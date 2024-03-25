package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		
		celda1 = new Celda(codigoCelda1);
		celda2 = new Celda(codigoCelda2);
		celda3 = new Celda(codigoCelda3);
		celda4 = new Celda(codigoCelda4);

	}

	public void mostrarConfiguracion() {
		System.out.println("Codigo1: " + celda1.getCodigo());
		System.out.println("Codigo2: " + celda2.getCodigo());
		System.out.println("Codigo3: " + celda3.getCodigo());
		System.out.println("Codigo4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigoCelda) {
		if (celda1 != null && celda1.getCodigo().equals(codigoCelda)) {
			return celda1;
		} else if (celda2 != null && celda2.getCodigo().equals(codigoCelda)) {
			return celda2;
		} else if (celda3 != null && celda3.getCodigo().equals(codigoCelda)) {
			return celda3;
		} else if ( celda4 != null && celda4.getCodigo().equals(codigoCelda)) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigoCelda, int intems) {
		Celda celdaRecuperada = buscarCelda(codigoCelda);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(producto, intems);
		}
	}

	public void mostrarProductos() {
		Producto pro1 = celda1.getProducto(); 
		Producto pro2 = celda2.getProducto(); 
		Producto pro3 = celda3.getProducto(); 
		Producto pro4 = celda4.getProducto(); 
		System.out.println("************Celda: "+celda1.getCodigo());
		if(celda1 != null && pro1!=null) {
			System.out.println("Stock: "+celda1.getStock());
			System.out.println("Nombre: "+pro1.getNombre());
			System.out.println("Precio: "+pro1.getPrecio());
			System.out.println("Codigo: "+pro1.getCodigo());
		}else{
			System.out.println("La celda no tiene producto!!!");
		}
		
		System.out.println("************Celda: "+celda2.getCodigo());
		if(celda2 != null && pro2 != null ) {
			System.out.println("Stock: "+celda2.getStock());
			System.out.println("Nombre: "+pro2.getNombre());
			System.out.println("Precio: "+pro2.getPrecio());
			System.out.println("Codigo: "+pro2.getCodigo());
			
		}else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("************Celda: "+celda3.getCodigo());
		if(celda3 != null && pro3 != null) {
			System.out.println("Stock: "+celda3.getStock());
			System.out.println("Nombre: "+pro3.getNombre());
			System.out.println("Precio: "+pro3.getPrecio());
			System.out.println("Codigo: "+pro3.getCodigo());
			
		}else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("************Celda: "+celda4.getCodigo());
		if(celda4 != null && pro4 != null ) {
			System.out.println("Stock: "+celda4.getStock());
			System.out.println("Nombre: "+pro4.getNombre());
			System.out.println("Precio: "+pro4.getPrecio());
			System.out.println("Codigo: "+pro4.getCodigo());
			
		}else {
			System.out.println("La celda no tiene producto!!!");
		}
		System.out.println("------------------------");
		System.out.println("Saldo: " + getSaldo());
	}

	public Producto buscarProductoEnCelda(String c1) {
		
		Celda celdaBuscada = buscarCelda(c1);
		if(celdaBuscada != null) {
			Producto productoEnCelda = celdaBuscada.getProducto();
			return productoEnCelda;
		}else {
			return null;
		}
	}

	public double consultarPrecio(String codigo) {
		Producto p1 = celda1.getProducto();
		Producto p2 = celda2.getProducto();
		Producto p3 = celda3.getProducto();
		Producto p4 = celda4.getProducto();
		if (celda1 != null && celda1.getCodigo().equals(codigo)) {
			return p1.getPrecio();
		} else if (celda2 != null && celda2.getCodigo().equals(codigo)) {
			return p2.getPrecio();
		} else if (celda3 != null && celda3.getCodigo().equals(codigo)) {
			return p3.getPrecio();
		} else if (celda4 != null && celda4.getCodigo().equals(codigo)) {
			return p4.getPrecio();
		} else {
			return 0;
		}
	}

	public Celda buscarCeldaProducto(String producto) {
		Producto p1 = celda1.getProducto();
		Producto p2 = celda2.getProducto();
		Producto p3 = celda3.getProducto();
		Producto p4 = celda4.getProducto();
		Celda n1 = null;
		if(celda1 != null && p1!=null) {
			if (p1.getCodigo()== producto) {
				n1 =  celda1;
				}
		}else if(celda2 != null && p2!=null) {
			if (p2.getCodigo()==producto) {
				n1=  celda2;
				}
		}else if(celda3 != null && p3!=null) {
			if (p3.getCodigo()==producto) {
				n1 = celda3;
				}
		}else if(celda4 != null && p4!=null) {
			if (p4.getCodigo() == producto) {
				n1 =  celda4;
				}
		}else {
			n1=  null;
			}
		return n1;
	}

	public void incrementarProductos(String codPro, int intems) {
		Celda celdaEncontrada = buscarCeldaProducto(codPro);
		int incremento = celdaEncontrada.getStock()+intems;
		celdaEncontrada.setStock(incremento);
	}

	public void vender(String codCel) {
		Producto p1 = celda1.getProducto();
		Producto p2 = celda2.getProducto();
		Producto p3 = celda3.getProducto();
		Producto p4 = celda4.getProducto();
		if(celda1 != null) {
			if (codCel == celda1.getCodigo()) {
				int actual = celda1.getStock();
				actual = actual - 1;
				celda1.setStock(actual);
				double preSal = p1.getPrecio();
				preSal = preSal + getSaldo();
				setSaldo(preSal);
		}
		if(celda2 != null) {
			if (codCel == celda2.getCodigo()) {
				int actual = celda2.getStock();
				actual = actual - 1;
				celda2.setStock(actual);
				double preSal = p2.getPrecio();
				preSal = preSal + getSaldo();
				setSaldo(preSal);
				}
			
		}
		if(celda3 != null) {
			if (codCel == celda3.getCodigo()) {
				int actual = celda3.getStock();
				actual = actual - 1;
				celda3.setStock(actual);
				double preSal = p3.getPrecio();
				preSal = preSal + getSaldo();	
				setSaldo(preSal);
				}
		}
		if(celda4 != null) {
			if (codCel == celda4.getCodigo()) {
				int actual = celda4.getStock();
				actual = actual - 1;
				celda4.setStock(actual);
				double preSal = p4.getPrecio();
				preSal = preSal + getSaldo();
				setSaldo(preSal);
					}
			}
		}
	}

	public double venderConCambio(String codCel, double valor) {
		Producto p1 = celda1.getProducto();
		Producto p2 = celda2.getProducto();
		Producto p3 = celda3.getProducto();
		Producto p4 = celda4.getProducto();
		if (codCel == celda1.getCodigo()) {
			int actual = celda1.getStock();
			actual = actual - 1;
			celda1.setStock(actual);
			double preSal = p1.getPrecio();
			preSal = preSal - getSaldo();
			setSaldo(preSal);
			double cambio = valor - p1.getPrecio();
			return cambio;
		} else if (codCel == celda2.getCodigo()) {
			int actual = celda2.getStock();
			actual = actual - 1;
			celda2.setStock(actual);
			double preSal = p2.getPrecio();
			preSal = preSal + getSaldo();
			setSaldo(preSal);
			double cambio = valor - p2.getPrecio();
			return cambio;
		} else if (codCel == celda3.getCodigo()) {
			int actual = celda3.getStock();
			actual = actual - 1;
			celda3.setStock(actual);
			double preSal = p3.getPrecio();
			preSal = preSal + getSaldo();
			setSaldo(preSal);
			double cambio = valor - p3.getPrecio();
			return cambio;
		} else if (codCel == celda4.getCodigo()) {
			int actual = celda4.getStock();
			actual = actual - 1;
			celda4.setStock(actual);
			double preSal = p4.getPrecio();
			preSal = preSal + getSaldo();
			setSaldo(preSal);
			double cambio = valor - p4.getPrecio();
			return cambio;
		} else {
			return 0;
		}
	}

	// ----------------------
	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
