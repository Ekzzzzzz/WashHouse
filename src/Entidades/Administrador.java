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


public class Administrador extends Usuario {

    // Atributos específicos del administrador
    
    private List<Trabajador> trabajadores;

    // Constructor
    public Administrador(String correo, String contraseña) {
        super(correo, contraseña);
        this.trabajadores = new ArrayList<>();
    }

    // Implementación del método iniciarSesion
    
    @Override
    public boolean iniciarSesion(String correo, String contraseña) {
        // Lógica para verificar las credenciales del administrador
        return this.getCorreo().equals(correo) && this.getContraseña().equals(contraseña);
    }

    // Métodos para gestionar trabajadores
    
    public void agregarTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }

    public List<Trabajador> obtenerTrabajadores() {
        return trabajadores;
    }

    public void modificarCita(Reserva cita) {
        // modificar una cita 
    }

   
}

