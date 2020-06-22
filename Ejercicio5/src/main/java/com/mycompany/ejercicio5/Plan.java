/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio5;

public class Plan {

    private String nombre;
    private float deuda;
    private int cuotas;
    private Pago[] pagos;

    public Plan(String nombre, float deuda, int cuotas) {
        this.nombre = nombre;
        this.deuda = deuda;
        this.cuotas = cuotas;
        this.pagos = new Pago[cuotas];
    }

    public String getNombre() {
        return nombre;
    }

    public float getDeuda() {
        return deuda;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void agregarPago(Pago p) {
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                pagos[i] = p;
                break;
            }
        }
    }

    public float sumaInteresesCobrados() {
        float intereses = 0f;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] != null && pagos[i].getDemora() > 0) {
                intereses += (pagos[i].getDemora() * pagos[i].getInteresesAdicionales() * pagos[i].getImporte());
            }
        }
        return intereses;
    }

    public boolean estaPagadoTotalmente() {
        boolean pagado = true;
        for (int i = 0; i < pagos.length; i++) {
            if (pagos[i] == null) {
                pagado = false;
                break;
            }
        }

        return pagado;
    }

    public String listadoPagos() {
        String listado = "";
        for (int i = 0; i < pagos.length; i++) {
            listado += pagos[i].toString();
        }
        return listado;
    }
}
