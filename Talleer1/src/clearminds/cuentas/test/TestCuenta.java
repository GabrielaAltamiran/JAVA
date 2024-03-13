package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		Cuenta cuenta2 = new Cuenta("03476", "C", 39);
		Cuenta cuenta3 = new Cuenta("03476");
		//Crear cuenta 4
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setSaldo(10);
		//Crear cuenta 5
		Cuenta cuenta5 = new Cuenta("0557","C",10);
		//Crear cuenta 6
		Cuenta cuenta6 = new Cuenta("0666");
		cuenta6.setSaldo(0);
		//--------------------------------
		cuenta3.setTipo("C");
		System.out.println("------------Valores iniciales-------------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("-------------Valores modificados----------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("*************IMPRIMIR CON MI ESTILO****************");
		System.out.println("*************CUENTA 4****************");
		cuenta4.imprimirConMiEstilo();
		System.out.println("*************CUENTA 5****************");
		cuenta5.imprimirConMiEstilo();
		System.out.println("*************CUENTA 6****************");
		cuenta6.imprimirConMiEstilo();
	}

}
