package com.campusdual.classroom;

import java.util.Objects;

public class Exercise03 {

    // Esto es una funcion, ya que devuelve un valor

    public static String greetings(String name) {
        String mensajeBienvenida = "Hola. Bienvenido " + name;
        return mensajeBienvenida;
    }

    // Esto es una funcion, ya que devuelve un valor

    public static String error(String nombre) {
        String mensajeError = "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;

        return mensajeError;
    }

    //Esto es un procedimiento, ya que no devuelve un valor

    public static void checkUser(String user, String pass) {
        String nombreCorrecto = "Sebas";
        String contraseñaCorrescta = "sebas01";

        if (Objects.equals(nombreCorrecto, user) && Objects.equals(contraseñaCorrescta, pass)) {
            System.out.println(greetings(user));
        } else {
            System.out.println(error(nombreCorrecto));
        }
    }


    public static void main(String[] args) {
        checkUser("Sebas", "sebas01");
        checkUser("Mavic", "Mavic01");


    }
}
