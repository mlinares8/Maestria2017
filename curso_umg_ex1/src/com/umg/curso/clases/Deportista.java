package com.umg.curso.clases;

/**
 * Created by alumno on 28/06/2017.
 */
public class Deportista {
    private String nombre;
    private int edad;



    public Deportista(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Deportista(String next) {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
