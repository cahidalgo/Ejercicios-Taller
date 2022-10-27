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
public class LotePropio extends Lote {

    public LotePropio() {
    }
    
    public int puntaje(int estadoterreno,int antiguedad){
        
        int puntaje= estadoterreno+antiguedad;
        return puntaje;
    }
    
    public int ganancias (int hectareas, int precioxhectarea){
    
    int ganancia=hectareas*precioxhectarea;
    return ganancia;
    
    }
    
}
