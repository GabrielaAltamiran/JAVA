package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TextRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		//area 
		int areaR1=10;
		int areaR2=5;
		
		r1.setAltura(areaR1);
		r1.setBase(areaR1);
		
		r2.setAltura(areaR2);
		r2.setBase(areaR2);
		
		System.out.println("-------------------AREA--------------------");
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		System.out.println("Area de r1 :"+areaR1);
		System.out.println("Area de r2 :"+areaR2);
		
		//Perimetro
		double perimetro1=20;
		double perimetro2=4;
		
		r1.setAltura1(perimetro1);
		r1.setBase1(perimetro1);
		

		r2.setAltura1(perimetro2);
		r2.setBase1(perimetro2);
		System.out.println("------------------Perimetro-----------------");
		
		perimetro1 = r1.calcularPerimetro();
		perimetro2 = r2.calcularPerimetro();
		System.out.println("Perimetro de r1 :"+perimetro1);
		System.out.println("Perimetro de r2 :"+perimetro2);
		System.out.println("---------------------------------------");

	}

}
