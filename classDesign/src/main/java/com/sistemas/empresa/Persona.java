package com.sistemas.empresa;

public class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private long celular;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String direccion, long celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return
                " Nombre='" + nombre + '\'' +
                        " Apellido='" + apellido + '\'' +
                        " Direccion='" + direccion + '\'' +
                        " Celular=" + celular;
    }
}
