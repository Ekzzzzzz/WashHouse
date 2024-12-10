/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Eduard
 */


import java.util.ArrayList;
import java.util.List;

public class Trabajador extends Usuario {

    // Atributos específicos del trabajador
    
    private List<Reserva> citasAgendadas;

    // Constructor
    public Trabajador(String correo, String contraseña) {
        super(correo, contraseña);
        this.citasAgendadas = new ArrayList<>();
    }

    // Implementación del método iniciarSesion
    
    @Override
    public boolean iniciarSesion(String correo, String contraseña) {
        //credenciales del trabajador
        return this.getCorreo().equals(correo) && this.getContraseña().equals(contraseña);
    }

    // Métodos para agendar citas
    public void agendarCita(Reserva cita) {
        citasAgendadas.add(cita);
    }

    public List<Reserva> obtenerCitasAgendadas() {
        return citasAgendadas;
    }

    
}

