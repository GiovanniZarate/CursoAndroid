package com.proyecto.cursoandroid;

import android.app.Application;

public class GlobalClass extends Application {
    private String Nombre;
    private String Apellido;
    private String dni;

    public GlobalClass(String nombre, String apellido, String dni) {
        Nombre = nombre;
        Apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
