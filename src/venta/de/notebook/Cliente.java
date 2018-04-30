/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta.de.notebook;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Cliente {

    private String nombre;
    private int dni;
    private List<Orden> ordenes;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        ordenes=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public void addOrden(Orden o) {
        ordenes.add(o);
    }

    public void ordenarOrdenesPorCantidadDeItems() {
        int n = ordenes.size();
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (ordenes.get(i).getNroItems() > ordenes.get(k).getNroItems()) {
                     Orden temp = ordenes.set(i, ordenes.get(k));
                     ordenes.set(k, temp);
                             
                }
            }
        }
    }

}
