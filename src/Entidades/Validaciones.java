/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Eduard
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {

    // Método para validar si el correo tiene un formato correcto
    
    public static boolean validarCorreo(String correo) {
        
        // Expresión regular para validar el formato del correo electrónico
        
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);
        // Retorna true si el correo es válido, false si no lo es
        return matcher.matches(); 
    }

    // Método para validar la contraseña (por ejemplo, mínimo 6 caracteres)
    
    public static boolean validarContrasena(String contrasena) {
        // al menos 6 caracteres
        return contrasena.length() >= 6;
    }
}

