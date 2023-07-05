package org.example;

import org.example.modelos.Usuario;

public class Main {
    public static void main(String[] args) {
       Integer edad=34;
       //LOS OBJETOS SON VARIABLES, ESPECIALES
        Universidad objetoUniversidad=new Universidad();
        Usuario objetoUsuario=new Usuario(25,"andres","123",400,"andy@gmail.com");

        //creo un objeto para acceder o modificar los atributos o metodos
        //de ese objeto
        System.out.println(objetoUniversidad.nombres);
        System.out.println(objetoUsuario.nombres);
    }
}