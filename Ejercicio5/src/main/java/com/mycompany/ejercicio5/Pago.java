/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio5;

public class Pago {

    private int demora;
    private float importe;
    private float interesesAdicionales;

    public int getDemora() {
        return demora;
    }

    public float getImporte() {
        return importe;
    }

    public float getInteresesAdicionales() {
        return interesesAdicionales;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public void setInteresesAdicionales(float interesesAdicionales) {
        this.interesesAdicionales = interesesAdicionales;
    }

    public Pago(int demora, float importe) {
        this.demora = demora;
        this.importe = importe;
        this.interesesAdicionales = 0.005f;
    }

    @Override
    public String toString() {
        return "Pago{" + "demora=" + demora + ", importe=" + importe + ", interesesAdicionales=" + interesesAdicionales + '}';
    }

}
