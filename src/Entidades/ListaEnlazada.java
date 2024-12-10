/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Eduard
 */
public class ListaEnlazada {
    private Nodo head; 

   
    private class Nodo {
        Reserva reserva;
        Nodo siguiente;

        public Nodo(Reserva reserva) {
            this.reserva = reserva;
            this.siguiente = null;
        }
    }

   
    public void agregarReserva(Reserva reserva) {
        Nodo nuevoNodo = new Nodo(reserva);
        if (head == null) {
            head = nuevoNodo;
        } else {
            Nodo temp = head;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
        }
    }

   
    public void imprimirReservas() {
        Nodo temp = head;
        while (temp != null) {
            System.out.println(temp.reserva);
            temp = temp.siguiente;
        }
    }
    
    public Reserva obtenerUltimaReserva() {
    Nodo temp = head;
    while (temp != null) {
        // Avanzamos hasta el final de la lista
        temp = temp.siguiente;
    }
    return temp != null ? temp.reserva : null; // Retorna la última reserva
}
}

