
package com.mycompany.alquielrauto;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) 
    {
        int km;
        double pago;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Km que realizo");
        km=sc.nextInt();
        Alquiler a=new Alquiler();
        
        a.setKilometro(km);
        pago=a.calcularPrecio();
        
        
        System.out.println("El precio que debe abonar es: $" + pago);
    }
    
}
