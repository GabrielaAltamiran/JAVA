package entidades;

public class Numero {
	private String numeroCarta;
	private int valor;
	//------------------GET & SET---------------
	public String getNumeroCarta() {
		return numeroCarta;
	}
	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	//--------------------CONSTRUCTOR------------
	public Numero(String numeroCarta, int valor) {
		this.numeroCarta = numeroCarta;
		this.valor = valor;
	}
	//-----------------METODO MOSTRARINFORMACION----
	public void mostrarInformacion() {
		System.out.println(numeroCarta+"-"+valor);
	}

}
