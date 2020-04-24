package com.proyecto.cursoandroid.fuente;

public class Usuario {
    int Identificador;
    String Nombre;
    int Imagen;

    public Usuario(int identificador, String nombre, int imagen) {
        Identificador = identificador;
        Nombre = nombre;
        Imagen = imagen;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int identificador) {
        Identificador = identificador;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
