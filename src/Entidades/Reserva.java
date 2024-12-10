/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Eduard
 */


public class Reserva {
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;
    private String fecha;
    private String servicio;
    private String hora;
    private String jornada;
    private String correo;

    // Constructor
    public Reserva(String dni, String nombre, String apellido, String celular, String fecha,
                   String servicio, String hora, String jornada, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.fecha = fecha;
        this.servicio = servicio;
        this.hora = hora;
        this.jornada = jornada;
        this.correo = correo;
    }

    // Getters y setters (opcional)
    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCelular() {
        return celular;
    }

    public String getFecha() {
        return fecha;
    }

    public String getServicio() {
        return servicio;
    }

    public String getHora() {
        return hora;
    }

    public String getJornada() {
        return jornada;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Reserva [DNI=" + dni + ", Nombre=" + nombre + ", Apellido=" + apellido + ", Celular=" + celular +
               ", Fecha=" + fecha + ", Servicio=" + servicio + ", Hora=" + hora + ", Jornada=" + jornada + ", Correo=" + correo + "]";
    }

    public Object getdni() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}