package com.krakedev.test;

import com.krakedev.Calculadora;

public class TextCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicar;
		double resultadoDividir;
		double resultadoPromedio;
		//MostrarResultado
		Calculadora n;
		n = new Calculadora();
		n.mostrarResultado();
		//
		calcu = new Calculadora();
		resultadoResta = calcu.restar(10, 5);
		resultadoSuma  = calcu.sumar(5,8);
		resultadoMultiplicar = calcu.multiplicar(3, 5);
		resultadoDividir = calcu.dividir(81, 9);
		resultadoPromedio = calcu.promediar(3, 10, 10);
		
		System.out.println("Resultado suma : "+resultadoSuma);
		System.out.println("Resultado resta :"+resultadoResta);
		System.out.println("Resultado multiplicacion :"+resultadoMultiplicar);
		System.out.println("Resultado divicion :"+resultadoDividir);
		System.out.println("Resultado promedio :"+resultadoPromedio);
		
		
		

	}

}
