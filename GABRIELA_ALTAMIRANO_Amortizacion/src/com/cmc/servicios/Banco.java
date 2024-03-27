package com.cmc.servicios;

import java.util.ArrayList;

import com.cmc.entidades.Cliente;
import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;

public class Banco {
    private ArrayList<Prestamo> prestamos;
    private ArrayList<Cliente> clientes;

    public Banco() {
        prestamos = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    // Getter para el atributo prestamos
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    // Getter para el atributo clientes
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Cliente buscarCliente(String cedula) {
        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getCedula().equals(cedula)) {
                return cliente; // Se encontró el cliente
            }
        }
        return null; // Cliente no encontrado
    }

    public void registrarCliente(Cliente nuevoCliente) {
        String cedula = nuevoCliente.getCedula();
        // Verificar si el cliente ya existe
        if (buscarCliente(cedula) == null) {
            // El cliente no existe, agregarlo a la lista de clientes
            clientes.add(nuevoCliente);
        } else {
            System.out.println("Cliente con cédula " + cedula + " ya está registrado.");
        }
    }

    public void asignarPrestamo(String cedula, Prestamo prestamo) {
        Cliente cliente = buscarCliente(cedula);

        if (cliente == null) {
            System.out.println("El cliente con cédula " + cedula + " no es cliente del banco.");
        } else {
            // Asignar el cliente al préstamo (si el préstamo tiene un atributo para el
            // cliente)
            prestamo.setCliente(cliente);

            // Generar la tabla de amortización para el préstamo
            CalculadoraAmortizacion.generarTabla(prestamo);

            // Agregar el préstamo a la lista de préstamos del banco
            prestamos.add(prestamo);
        }
    }

    public ArrayList<Prestamo> buscarPrestamo(String cedula) {
        Cliente cliente = buscarCliente(cedula);

        if (cliente != null) {
            ArrayList<Prestamo> prestamosCliente = new ArrayList<>();

            for (int i = 0; i < prestamos.size(); i++) {
                Prestamo prestamo = prestamos.get(i);
                if (prestamo.getCliente() == cliente) {
                    prestamosCliente.add(prestamo);
                }
            }

            if (prestamosCliente.isEmpty()) {
                return null; // Si no tiene préstamos, se retorna null
            } else {
                return prestamosCliente; // Si tiene préstamos, se retorna la lista de préstamos
            }
        } else {
            return null; // Cliente no encontrado
        }
    }

    public void mostrarCliente(String cedula) {
        Cliente cliente = buscarCliente(cedula);
        if (cliente != null) {
            cliente.mostrarCliente(); // Utiliza el método mostrarCliente del objeto Cliente
        } else {
            System.out.println("Cliente con cédula " + cedula + " no encontrado.");
        }
    }

}

