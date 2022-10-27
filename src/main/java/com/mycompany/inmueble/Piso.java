package com.mycompany.inmueble;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Piso extends Inmueble {
    private int nombre;
    private int est;
    private Usuario usuario;
    private Local[] loc;

    public Piso(int nom,int est) {
        this.nombre = nom;
        this.est = est;
    }
    
    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getEst() {
        return est;
    }

    public void setEst(int est) {
        this.est = est;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Local[] getLoc() {
        return loc;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setLoc(Local[] loc) {
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Piso{" + "nombre=" + nombre + ", est=" + est + ", usuario=" + usuario + '}';
    }

   

    
}
