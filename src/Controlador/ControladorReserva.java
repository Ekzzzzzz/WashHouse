/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Eduard
 */
import Entidades.Reserva;
import java.util.ArrayList;
import java.util.List;

public class ControladorReserva {

    private List<Reserva> reservas;

    public ControladorReserva() {
        reservas = new ArrayList<>();
    }

    
    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    // Método para listar todas las reservas
    public List<Reserva> obtenerTodasLasReservas() {
        return reservas;
    }

    // Método para buscar una reserva por DNI
    public Reserva buscarReservaPorDNI(String dni) {
        for (Reserva reserva : reservas) {
            if (reserva.getdni().equals(dni)) {
                return reserva;
            }
        }
        return null; // Si no se encuentra
    }

    // Método para eliminar una reserva por DNI
    public boolean eliminarReservaPorDNI(String dni) {
        Reserva reserva = buscarReservaPorDNI(dni);
        if (reserva != null) {
            reservas.remove(reserva);
            return true; // Eliminación exitosa
        }
        return false; // No se encontró
    }

    // Método para actualizar una reserva
    public boolean actualizarReserva(String dni, Reserva nuevaReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getdni().equals(dni)) {
                reservas.set(i, nuevaReserva);
                return true;
            }
        }
        return false;
    }
}


