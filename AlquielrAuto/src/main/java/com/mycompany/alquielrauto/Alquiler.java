/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alquielrauto;

/**
 *
 * @author fnqi
 */
public class Alquiler {
    private final double precioBase=300;
    private int kilometro;
    public Alquiler()
    {
        this.kilometro=0;
    }

    public int getKilometro() {
        return kilometro;
    }

    public void setKilometro(int kilometro) {
        this.kilometro = kilometro;
    }

   
    
    public double calcularPrecio()
    {
       final int kilobase=200;
       double precio;
        if(kilometro<=200)
        {
            precio=precioBase;
        }
        else
        {
            if(kilometro<=1000)
            {
                precio=precioBase+(kilometro-kilobase)*5;
            }
            else
            {
                precio=precioBase+(kilometro-kilobase)*10;
            }
        }
        
        return precio;
    }
}
