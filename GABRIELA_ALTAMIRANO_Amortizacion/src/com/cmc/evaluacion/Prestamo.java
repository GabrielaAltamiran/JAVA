package com.cmc.evaluacion;

import com.cmc.entidades.Cliente;
import com.cmc.entidades.Cuota;

public class Prestamo {
    private double monto;
    private double interes;
    private int plazo;
    private Cliente cliente;
    private Cuota[] cuotas;

    public Prestamo(double monto, double interes, int plazo) {
        this.monto = monto;
        this.interes = interes / 100.0; // Transformar el interés a decimal
        this.plazo = plazo;
        this.cuotas = new Cuota[plazo];
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public Cuota[] getCuotas() {
        return cuotas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void mostrarPrestamo() {
        System.out.println(
                "[Monto = " + monto + ", " + "Interés: " + (interes * 100) + " %" + " " + "Plazo = " + plazo + "]");
    }
}
