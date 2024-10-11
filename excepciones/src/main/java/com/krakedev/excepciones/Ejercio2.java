package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercio2 {
	public void metodo1() {
		String a=null;
		a.substring(0);
		//NPE UNCHEKED
		
	}
	public void metodo2() {
		File f=new File("archivo1.txt");
		try {
			f.createNewFile();// IOException = CHECKED
		}catch(IOException io) {
			System.out.println("Error");
		}
		
		
	}
	public void metodo3() throws IOException { //Es como no hacerce cargo del error
		File f=new File("archivo1.txt");
		f.createNewFile();// IOException = CHECKED
		
	}

}
