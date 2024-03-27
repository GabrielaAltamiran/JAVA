package entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	// ------------Get de cartas-------------
	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	// -----------------------------------------
	public Naipe() {
		this.numerosPosibles = new ArrayList<Numero>();
		this.cartas = new ArrayList<Carta>();
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2));
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5", 5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("11", 11));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));

		String[] palos = { "CR", "CN", "DI", "TR" };
		for (int i = 0; i < numerosPosibles.size(); i++) {
			for (int j = 0; j < palos.length; j++) {
				Carta carta = new Carta(numerosPosibles.get(i), palos[j]);
				cartas.add(carta);
			}
		}
	}

	// --------------------------
	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxiliar = new ArrayList<Carta>();

		// Asignar estado N
		for (int i = 0; i < cartas.size(); i++) {
			cartas.get(i).setEstado("N");
		}

		for (int x = 0; x < 100; x++) {
			int posicion = Random.obtenerPosicion();
			Carta carta = cartas.get(posicion);
			if (carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}

		for (int j = 0; j < cartas.size(); j++) {
			if (cartas.get(j).getEstado().equals("N")) {
				auxiliar.add(cartas.get(j));
			}

		}
		return auxiliar;
	}

}
