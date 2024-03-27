package com.cmc.evaluacion;

import com.cmc.entidades.Cuota;

public class CalculadoraAmortizacion {

    public static double calcularCuota(Prestamo prestamo) {
        double monto = prestamo.getMonto();
        double interes = prestamo.getInteres();
        int plazo = prestamo.getPlazo();

        // Calcular la tasa de interés mensual
        double tasaMensual = interes / 12.0;
        // System.out.println(tasaMensual);

        // Calcular la cuota mensual
        double cuota = (monto * tasaMensual) / (1 - Math.pow(1 + tasaMensual, -plazo));

        return cuota;
    }

    public static void generarTabla(Prestamo prestamo) {
        double cuota = calcularCuota(prestamo);

        // Crear e inicializar las cuotas del préstamo
        Cuota[] cuotas = prestamo.getCuotas();
        for (int i = 0; i < cuotas.length; i++) {
            cuotas[i] = new Cuota(i + 1);
            cuotas[i].setCuota(cuota);

            if (i == 0) {
                // Para la primera cuota, el valor de inicio del período es igual al monto del
                // préstamo
                cuotas[i].setInicio(prestamo.getMonto());
            } else {
                // Para las cuotas posteriores, el valor de inicio del período es igual al saldo
                // de la cuota anterior
                cuotas[i].setInicio(cuotas[i - 1].getSaldo());
            }

            calcularValoresCuota(prestamo.getInteres(), cuotas[i]);
        }
    }

    public static void calcularValoresCuota(double interes, Cuota cuota) {
        double interesCalculado = cuota.getInicio() * (interes / 12.0);
        double abonoCapital = cuota.getCuota() - interesCalculado;
        double saldo = cuota.getInicio() - abonoCapital;

        cuota.setInteres(interesCalculado);
        cuota.setAbonoCapital(abonoCapital);
        cuota.setSaldo(saldo);
    }

    public static void mostrarTabla(Prestamo prestamo) {
        Cuota[] cuotas = prestamo.getCuotas();

        System.out.println("Número | Cuota | Inicio | Interés | Abono Capital | Saldo");

        for (Cuota cuota : cuotas) {
            System.out.printf("%d | %.2f | %.2f | %.2f | %.2f | %.2f%n", cuota.getNumero(), cuota.getCuota(),
                    cuota.getInicio(), cuota.getInteres(), cuota.getAbonoCapital(), cuota.getSaldo());
        }
    }

}

