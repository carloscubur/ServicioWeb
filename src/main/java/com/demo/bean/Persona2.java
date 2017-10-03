package com.demo.bean;

public class Persona2 {

    private int id;
    private String nombre;
    private String apellido;
    private int apodo;

    public Persona2() {
    }

    public Persona2(int id, String nombre, String apellido, int apodo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apodo = apodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getApodo() {
        return apodo;
    }

    public void setApodo(int apodo) {
        this.apodo = apodo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}