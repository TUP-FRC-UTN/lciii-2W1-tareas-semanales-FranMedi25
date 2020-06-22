/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.composicionlist;

import java.util.ArrayList;

public class Curso {

    private String nombre;
    private ArrayList listaAlumnos;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Curso(String nombre) {
        this.nombre = nombre;
        this.listaAlumnos = new ArrayList();
    }

    public void cargarAlumno(Alumno a) {
        listaAlumnos.add(a);
    }

    public float promedioGeneral() {
        float total = 0f;

        for (Object o : listaAlumnos) {
            Alumno a = (Alumno) o;
            total += a.promedio();
        }
        return total / listaAlumnos.size();
    }

    public int cantidadMayor8() {
        int c = 0;
        for (Object o : listaAlumnos) {
            Alumno a = (Alumno) o;
            if (a.promedio() > 8) {
                c++;
            }
        }
        return c;
    }

    public String listadoOpcionStringBuilderForEach() {
        StringBuilder sb = new StringBuilder();
        for (Object o : listaAlumnos) {
            sb.append(o.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

}
