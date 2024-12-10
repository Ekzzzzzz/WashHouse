/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Entidades.Administrador;
import Entidades.Cliente;
import Entidades.Usuario;
import Entidades.Validaciones;
import java.util.List;

/**
 *
 * @author Eduard
 */

public class ControladorUsuario {

    private List<Usuario> usuarios; // Lista de usuarios registrados (clientes y administradores)

    // Constructor que recibe la lista de usuarios
    
    public ControladorUsuario(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    // Método para validar el inicio de sesión
    
    public Usuario iniciarSesion(String correo, String contrasena) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contrasena)) {
                return usuario; // Si las credenciales son correctas, retorna el usuario
            }
        }
        return null; // Si no se encuentra el usuario, retorna null
    }

    // Método para validar el correo 
    public boolean validarCorreo(String correo) {
        return Validaciones.validarCorreo(correo);
    }

    // Método para verificar si el usuario es un Administrador
    
    public boolean esAdministrador(Usuario usuario) {
        return usuario instanceof Administrador;
    }

    // Método para verificar si el usuario es un Cliente
    
    public boolean esCliente(Usuario usuario) {
        return usuario instanceof Cliente;
    }
}

