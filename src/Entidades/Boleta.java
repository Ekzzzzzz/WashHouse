/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Eduard
 */

import java.util.Date;

public class Boleta {

    // Atributos
    
    private int id;
    private Cliente cliente;
    private Reserva reserva;
    private double monto;
    private Date fecha;
    private String estado;

    // Constructor
    
    public Boleta(int id, Cliente cliente, Reserva reserva, double monto, Date fecha, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.reserva = reserva;
        this.monto = monto;
        this.fecha = fecha;
        this.estado = estado;
    }

    // Getters y Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

