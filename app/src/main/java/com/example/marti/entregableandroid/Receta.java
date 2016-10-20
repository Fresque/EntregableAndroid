package com.example.marti.entregableandroid;

import java.util.ArrayList;

/**
 * Created by marti on 10/17/2016.
 */

public class Receta {

    String nombre;
    ArrayList<String> listaDeIngredientes;
    String preparacion;

    public Receta(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }


}
