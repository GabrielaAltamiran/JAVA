package com.cmc.entidades;

import com.cmc.evaluacion.Utilitario;

public class Cuota {
    private int numero;
    private double cuota;
    private double capital;
    private double inicio;
    private double interes;
    private double abonoCapital;
    private double saldo;

    public Cuota(int numero) {
        this.numero = numero;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getInicio() {
        return inicio;
    }

    public void setInicio(double inicio) {
        this.inicio = inicio;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getAbonoCapital() {
        return abonoCapital;
    }

    public void setAbonoCapital(double abonoCapital) {
        this.abonoCapital = abonoCapital;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void mostrarPrestamo() {
        String numeroFormat = String.format("%d", numero);
        String cuotaFormat = String.format("%.2f", Utilitario.redondear(cuota));
        String capitalFormat = String.format("%.2f", Utilitario.redondear(capital));
        String inicioFormat = String.format("%.2f", Utilitario.redondear(inicio));
        String interesFormat = String.format("%.2f", Utilitario.redondear(interes));
        String abonoCapitalFormat = String.format("%.2f", Utilitario.redondear(abonoCapital));
        String saldoFormat = String.format("%.2f", Utilitario.redondear(saldo));

        System.out.println(numeroFormat + " | " + cuotaFormat + " | " + capitalFormat + " | " + inicioFormat + " | "
                + interesFormat + " | " + abonoCapitalFormat + " | " + saldoFormat);
    }
}
