/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduard
 */


public class Cliente extends Usuario {

    // Atributos específicos del cliente
    
    private String nombre;
    private String apellido;
    private String celular;
    private List<Reserva> reservasRealizadas;

    // Constructor
    
    public Cliente(String correo, String contraseña, String nombre, String apellido, String celular) {
        super(correo, contraseña);
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.reservasRealizadas = new ArrayList<>();
    }



    // Métodos para gestionar reservas
    public void realizarReserva(Reserva reserva) {
        reservasRealizadas.add(reserva);
    }

    public List<Reserva> obtenerReservasRealizadas() {
        return reservasRealizadas;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public boolean iniciarSesion(String correo, String contraseña) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

