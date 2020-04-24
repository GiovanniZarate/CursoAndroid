package com.proyecto.cursoandroid.fuente;

public class Publicacion {
    int Identificador;
    String Titulo;
    String Resumen;
    int Imagen;
    Usuario Propietario;

    public Publicacion(int identificador, String titulo, String resumen, int imagen, Usuario propietario) {
        Identificador = identificador;
        Titulo = titulo;
        Resumen = resumen;
        Imagen = imagen;
        Propietario = propietario;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int identificador) {
        Identificador = identificador;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getResumen() {
        return Resumen;
    }

    public void setResumen(String resumen) {
        Resumen = resumen;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }

    public Usuario getPropietario() {
        return Propietario;
    }

    public void setPropietario(Usuario propietario) {
        Propietario = propietario;
    }
}
