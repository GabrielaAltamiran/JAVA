package entidades;

public class Carta {
	private Numero numero;
	private String palo;
	private String estado;

	// ---------GET & SET----------
	public Numero getNumero() {
		return numero;
	}

	public void setNumero(Numero numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	// ------CONSTRUCTOR-------
	public Carta(Numero numero, String palo) {
		this.numero = numero;
		this.palo = palo;
		this.estado = "N";
	}

	// -----------------METODO MOSTRARINFORMACION----
	public void mostrarInformacion() {
		System.out.println(numero.getNumeroCarta() + "-" + palo);
	}

}
