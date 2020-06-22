/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio5;

public class Municipalidad {

    Plan[] planes;

    public Municipalidad(int tamaño) {
        planes = new Plan[tamaño];
    }

    public void agregarPlan(Plan p) {
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] == null) {
                planes[i] = p;
                break;
            }
        }
    }

    public int cantidadPlanesPagados() {
        int c = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                if (planes[i].estaPagadoTotalmente() == true) {
                    c++;
                }
            }
        }
        return c;
    }

    public float sumatoriaDeuda() {
        float deuda = 0f;
        for (int i = 0; i < planes.length; i++) {
            deuda += planes[i].getDeuda();
        }
        return deuda;
    }

    public String listadoPagosContribuyentes(String nombre) {
        String pagosContribuyente = "";
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].getNombre() == nombre) {
                pagosContribuyente = planes[i].listadoPagos();
            }
        }
        return pagosContribuyente;
    }

    public float promedioIntereses() {
        float prom = 0f;
        int cont = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null && planes[i].sumaInteresesCobrados() > 0) {
                prom += planes[i].sumaInteresesCobrados();
                cont++;
            }
        }
        return prom / cont;

    }

}
