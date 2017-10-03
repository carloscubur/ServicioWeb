package com.demo.bean;

public class Persona2 {

    private int id;
    private String nombre;
    private int apodo;

    public Persona2() {
    }

    public Persona2(int id, String nombre, int apodo) {
        this.id = id;
        this.nombre = nombre;
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
}