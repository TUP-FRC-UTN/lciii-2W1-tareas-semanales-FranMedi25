/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.antiguedadvehiculos;

import java.util.Scanner;

/**
 *
 * @author fnqi
 */
public class Antiguedad {

    public static void main(String[] args) {
        int cAutos, cAutosPoco, cNoMuy, acu;
          cAutosPoco = cNoMuy = acu = 0;
          cAutos=-1;
        int antiguedad;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Ingrese la antiguedad del vehiculo");
            antiguedad = sc.nextInt();
            
                cAutos++;
              if (antiguedad >= 1 && antiguedad <= 5) {
                System.out.println("Nuevo");
                acu += antiguedad;
            } else if (antiguedad >= 6 && antiguedad <= 10) {
                System.out.println("Poco Uso");
                acu += antiguedad;
                cAutosPoco++;
            } else if (antiguedad >= 11 && antiguedad <= 20) {
                System.out.println("Mucho Uso");
                acu += antiguedad;
            } else if (antiguedad > 20) {
                System.out.println("Muy Antiguo");
            }
        } while (antiguedad != 0);

        System.out.println("Cantidad de autos:" + cAutos);
        System.out.println("Cantidad de autos con poco uso:" + cAutosPoco);
        System.out.println(" Promedio autos no muy antiguos:" + Math.round(acu / cAutos));

    }

}
