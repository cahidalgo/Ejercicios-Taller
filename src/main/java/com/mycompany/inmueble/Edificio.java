package com.mycompany.inmueble;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Edificio extends Inmueble{
    private Piso[] piso;
    private String nombre;
    private int est;
    private Usuario usuario;
            
    public Edificio(String nombre, int est) {
        this.nombre = nombre;
        this.est = est;
    }
     
    
    public Piso[] getPiso() {
        return piso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPiso(Piso[] piso) {
        this.piso = piso;
    }

    public void setNombre(String nombre) {
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

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Edificio{" + "nombre=" + nombre + ", est=" + est + ", usuario=" + usuario + '}';
    }

   
}
