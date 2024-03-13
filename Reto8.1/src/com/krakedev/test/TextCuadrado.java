package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TextCuadrado {

	public static void main(String[] args) {
		Cuadrado cuadra =new Cuadrado();
		//Area primer cuadrado
		System.out.println("------------------------------------AREAS-----------------------------");
		System.out.println("--------------------------Primer cuadrado-----------------------------");
		double area1=2;
		cuadra.setLado(area1);
		area1 = cuadra.calcularAreaCuadrado();
		System.out.println("El area del cuadrado es: "+area1);
		//Area segundo cuadrado
		System.out.println("--------------------------Segundo cuadrado----------------------------");
		double area2=4;
		cuadra.setLado(area2);
		area2 = cuadra.calcularAreaCuadrado();
		System.out.println("El area del cuadrado es: "+area2);
		//Area tercer cuadrado 
		System.out.println("--------------------------Tercer cuadrado-----------------------------");
		double area3=8;
		cuadra.setLado(area3);
		area3 = cuadra.calcularAreaCuadrado();
		System.out.println("El area del cuadrado es: "+area3);
		//Perimetro primer cuadrado
		System.out.println("--------------------------PERIMETROS ---------------------------------");
		System.out.println("--------------------------Primer cuadrado-----------------------------");
		double perimetro1=3;
		cuadra.setLado(perimetro1);
		perimetro1 = cuadra.calcularPerimetroCuadrado();
		System.out.println("El perimetro del es : "+perimetro1);
		//Perimetro segundo cuadrado
		System.out.println("--------------------------Segundo cuadrado-----------------------------");
		double perimetro2=25;
		cuadra.setLado(perimetro2);
		perimetro2 = cuadra.calcularPerimetroCuadrado();
		System.out.println("El perimetro del es : "+perimetro2);
		//Perimetro tercer cuadrado
		System.out.println("--------------------------Tercer cuadrado------------------------------");
		double perimetro3 = 5;
		cuadra.setLado(perimetro3);
		perimetro3 = cuadra.calcularPerimetroCuadrado();
		System.out.println("El perimetro del es : "+perimetro3);

	}

}
