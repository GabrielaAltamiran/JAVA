package com.cmc.evaluacion;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Utilitario {
    // Método estático para redondear un valor double a 2 decimales
    public static double redondear(double valor) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat formatoDecimal = new DecimalFormat("#.00", symbols);
        String valorFormateado = formatoDecimal.format(valor);
        return Double.parseDouble(valorFormateado);
    }
}
    