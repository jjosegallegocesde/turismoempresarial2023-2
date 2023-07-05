package org.example;

import org.example.modelos.Usuario;

public class Main {
    public static void main(String[] args) {
        Integer edad = 29;
        //LOS OBJETOS SON VARIABLES, ESPECIALES
        Universidad objetoUniversidad = new Universidad("Carlos");
        Usuario objetoUsuario = new Usuario(25,"Carlos","1234",4,"ejemplo@gmail.com");

        //CREO UN OBJETO PARA ACCEDER O MODIFICAR LOS ATRIBUTOS O METODOS DE ESE OBJETO
        System.out.println(objetoUniversidad);
        System.out.println(objetoUsuario);
    }
}