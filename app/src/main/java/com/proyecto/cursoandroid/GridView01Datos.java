package com.proyecto.cursoandroid;

import java.io.Serializable;

public class GridView01Datos implements Serializable {
    private Integer Id;
    private Integer Imagen;
    private String Titulo;

    public GridView01Datos(Integer id, Integer imagen, String titulo) {
        Id = id;
        Imagen = imagen;
        Titulo = titulo;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getImagen() {
        return Imagen;
    }

    public void setImagen(Integer imagen) {
        Imagen = imagen;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
