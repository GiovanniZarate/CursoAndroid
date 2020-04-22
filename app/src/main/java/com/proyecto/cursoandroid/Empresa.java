package com.proyecto.cursoandroid;

import java.io.Serializable;

public class Empresa implements Serializable {
    int id;
    String Titulo;
    String Detalle;

    public Empresa(int id, String titulo, String detalle) {
        this.id = id;
        Titulo = titulo;
        Detalle = detalle;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }
}
