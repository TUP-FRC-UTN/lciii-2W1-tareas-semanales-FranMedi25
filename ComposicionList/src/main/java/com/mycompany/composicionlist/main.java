/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.composicionlist;

import java.util.Scanner;

/**
 *
 * @author fnqi
 */
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del curso");
        String nombreC = sc.next();
        System.out.println("Ingrese la cantida de alumnos");
        int cantAlumn = sc.nextInt();

        Curso c = new Curso(nombreC);

        System.out.println("Ingrese los datos del alumno = ");
        for (int i = 0; i < cantAlumn; i++) {
            System.out.println("Nombre = ");
            String nombre = sc.next();
            System.out.println("Legajo = ");
            int legajo = sc.nextInt();
            System.out.println("Ingrese la cantida de notas = ");
            int cantNotas = sc.nextInt();
            Alumno a = new Alumno(nombre, legajo);
            
            for (int j = 0; j < cantNotas;j++) {
                int u = 1;
                System.out.println("Ingrese la nota nro = " + u);
                int notaA = sc.nextInt();
                a.agregarNota(notaA);
                u++;
            }

            c.cargarAlumno(a);

        }
        System.out.println("Promedio general del curso: " + c.promedioGeneral());
        System.out.println("Cantidad de alumnos con promedio mayor a 8 : " + c.cantidadMayor8());
        System.out.println("Listado de alumnos: " + c.listadoOpcionStringBuilderForEach());

    }

}
