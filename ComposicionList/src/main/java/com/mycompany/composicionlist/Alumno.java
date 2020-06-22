/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.composicionlist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fnqi
 */
public class Alumno {

    private String nombre;
    private int legajo;
    ArrayList notas;

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public Alumno(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.notas = new ArrayList();
    }

    public void agregarNota(int nota) {
        notas.add(nota);
    }

    public float promedio() {
        float total = 0;
        for (Object o : notas) {
            Integer n = (Integer) o;
            total += n;
        }
        return (float) total / notas.size();
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", legajo=" + legajo + '}';
    }

}
