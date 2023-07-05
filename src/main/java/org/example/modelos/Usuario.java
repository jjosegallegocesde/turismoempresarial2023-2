package org.example.modelos;


public class Usuario{

    //ATRIBUTOS=VARIABLES=DATOS
    public Integer id;
    private String nombres;
    public String documento;
    public Integer ubicacion;
    public String correoElectronico;




    //METODOS=FUNCIONES=ACCIONES
    //METODOS ESPECIALES

    public Usuario() { //constructor vacio
    }

    public Usuario(Integer id, String nombres, String documento, Integer ubicacion, String correoElectronico) {
        this.id = id;
        this.nombres = nombres;
        this.documento = documento;
        this.ubicacion = ubicacion;
        this.correoElectronico = correoElectronico;
    }



    //METODOS ORDINARIOS


}

