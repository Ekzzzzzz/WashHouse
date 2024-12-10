/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Eduard
 */

public abstract class Usuario {
    
    // Atributos
    
    private String correo;
    private String contraseña;

    // Constructor
    
    public Usuario(String correo, String contraseña) {
        setCorreo(correo); // Valida el formato del correo
        this.contraseña = contraseña;
    }

    // Getters y Setters
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            this.correo = correo;
        } else {
            throw new IllegalArgumentException("Correo inválido. Ingrese un correo válido.");
        }
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Método abstracto
    public abstract boolean iniciarSesion(String correo, String contraseña);
}

