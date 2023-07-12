package org.example.validaciones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioValidacion {
    public UsuarioValidacion() {

    }
    //METODOS ORDINARIOS PARA VALIDAR DATOS
    public Boolean validarNombres(String nombres)throws Exception{
        String expresionRegular = "^[a-zA-Z]+$";
        Pattern patron = Pattern.compile(expresionRegular);
        Matcher coincidencia = patron.matcher(nombres);
        if(!coincidencia.matches()){
            throw new Exception("Señor usuario su nombre solo debe contener letras");
        }
        else if(nombres.length()<10){
            throw new Exception("El nombre debe de tener minimo 10 caracterés ");
        }
        else{
            return true;
        }
    }
}
