/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author pipel
 */
public class Semilla {

    Semilla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the decompra
     */
    public int getDecompra() {
        return decompra;
    }

    /**
     * @param decompra the decompra to set
     */
    public void setDecompra(int decompra) {
        this.decompra = decompra;
    }

    /**
     * @return the derecoleccion
     */
    public int getDerecoleccion() {
        return derecoleccion;
    }

    /**
     * @param derecoleccion the derecoleccion to set
     */
    public void setDerecoleccion(int derecoleccion) {
        this.derecoleccion = derecoleccion;
    }
    
    private int decompra;
    private int derecoleccion;

    public Semilla(int decompra, int derecoleccion) {
        this.decompra = decompra;
        this.derecoleccion = derecoleccion;
    }
    
    
    
}
