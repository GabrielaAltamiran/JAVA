package servicios;

import java.util.ArrayList;

import entidades.Carta;
import entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<ArrayList<Carta>> cartasJugadores;

	// ---------------Constructor-----------
	public Juego(ArrayList<String> arrayList) {
		this.naipe = new Naipe();
		this.cartasJugadores = new ArrayList<>();
		this.naipeBarajado = naipe.barajar();

		for (int i = 0; i < arrayList.size(); i++) {
			ArrayList<Carta> cartasParaJugador = new ArrayList<>();
			cartasJugadores.add(cartasParaJugador);
		}

	}
	// ------------------Get-----------------

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	// ------------------Metodo entregrarCartas------------------
	public void entregarCartas(int cartasPorJugador) {
		int totalJugadores = cartasJugadores.size();
		int posicion = 0;

		for (int i = 0; i < cartasPorJugador; i++) {
			for (int j = 0; j < totalJugadores; j++) {
				ArrayList<Carta> cartaJugador = cartasJugadores.get(j);
				if (posicion < naipeBarajado.size()) {
					cartaJugador.add(naipeBarajado.get(posicion++));
				}
			}
		}
	}

	// Metodo
	public int devolverTotal(String idJugador) {
		int total = 0;
		// Buscar el índice del jugador correspondiente al id
		int jugadorIndex = -1;
		for (int i = 0; i < cartasJugadores.size(); i++) {
			if (("jugador " + (i + 1)).equals(idJugador)) {
				jugadorIndex = i;
				break;
			}
		}

		if (jugadorIndex != -1) {
			ArrayList<Carta> cartas = cartasJugadores.get(jugadorIndex);
			for (int j = 0; j < cartas.size(); j++) {
				Carta carta = cartas.get(j);
				total += carta.getNumero().getValor();
			}
		}

		return total;
	}

	public String determinarGanador() {
		String idGanador = "";
		int sumaGanador = -1;

		for (int i = 0; i < cartasJugadores.size(); i++) {
			int sumaJugador = devolverTotal("jugador " + (i + 1));
			if (sumaJugador >= sumaGanador) {
				sumaGanador = sumaJugador;
				idGanador = "jugador " + (i + 1);
			}
		}

		return idGanador;
	}

}
