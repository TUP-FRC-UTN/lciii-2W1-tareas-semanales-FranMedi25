package com.mycompany.arreglopractica;

import java.util.Scanner;

/*
1. Desarrollar un programa que ingrese 10 números en un arreglo. Luego de
la carga calcular y mostrar:
a) Suma de todos
b) Promedio de todos
c) Cantidad de números mayores a 5

 */
public class Main {

    public static void main(String[] args) {
        int[] arreglo = new int[10];
        int c5 = 0, suma = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = sc.nextInt();
        }
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        for (int a : arreglo) {
            if (arreglo[a] > 5) {
                c5++;
            }
        }
        System.out.println("Suma = " + suma);
        System.out.println("Promedio = " + suma / arreglo.length);
        System.out.println("Cantidad de numeros mayores a 5 = " + c5);
    }
}
