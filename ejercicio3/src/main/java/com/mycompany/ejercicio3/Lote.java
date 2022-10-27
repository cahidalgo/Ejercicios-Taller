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
public abstract class Lote {
    
    private int antiguedad;
    private int estadoterreno;
    private String region;
    /**
     * @return the estadoterreno
     */
    public int getEstadoterreno() {
        return estadoterreno;
    }

    /**
     * @param estadoterreno the estadoterreno to set
     */
    public void setEstadoterreno(int estadoterreno) {
        this.estadoterreno = estadoterreno;
    }

    /**
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(String region) {
        this.region = region;
    }

    

    
    /**
     * @return the antiguedad
     */
    public int getAntiguedad() {
        return antiguedad;
    }

    /**
     * @param antiguedad the antiguedad to set
     */
    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    
    /*especifica como se realizara la fumigacion dependiendo de las plagas*/
    
    public void fumigacion(){
        
    }
    
    /*se usa segun el tipo de sembrado que se vaya a realizar*/
    public void sembrado(){
    }
}
