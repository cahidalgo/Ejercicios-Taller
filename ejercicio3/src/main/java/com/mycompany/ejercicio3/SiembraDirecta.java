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
public class SiembraDirecta implements Siembra {
    

    @Override
    public String PreparadoTierra() {
        String fumigacion=" quimicos";
        String cantidadquimicos= "10 litros de quimicos por hectarea";
        String arregladotierra= "tratado previo";
        String maquinaria= "podadora y rosiadores";
        return(fumigacion + cantidadquimicos+arregladotierra+ "con"+maquinaria );
        
    }

    @Override
    public void EliminacionMalesas(Boolean quimicos, Boolean herramienta) {
        
        quimicos=true;
        String cualesquimicos="los recomendados por su fabricante , pesticidas o fumigadores";
        herramienta=true;
        String herramientas="podadoras, fumigadores, trabajadores";
        
    }
    
    
}
