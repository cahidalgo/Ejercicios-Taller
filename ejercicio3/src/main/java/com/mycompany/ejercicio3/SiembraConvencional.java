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
public class SiembraConvencional implements Siembra{

    @Override
    public String PreparadoTierra() {
        String fumigacion="sin quimicos";
        String arregladotierra= "solo movimiento";
        return (fumigacion + arregladotierra) ;
        
    }

    @Override
    public void EliminacionMalesas(Boolean quimicos, Boolean herramienta) {
        quimicos=false;
        herramienta=false;
    }
    
    
    
    
    
}
