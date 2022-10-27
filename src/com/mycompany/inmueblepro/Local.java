package com.mycompany.inmueblepro;

/**
 *
 * @author User
 */
public class Local extends Inmueble {
    private int nombre;
    private Usuario usuario;
    private int estado;

    public Local(int name,int estado) {
        this.nombre=name;
        this.estado=estado;
    }
    

    public int getNombre() {
        return nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Local{" + "nombre=" + nombre + ", usuario=" + usuario + ", estado=" + estado + '}';
    }

    
    
    
    
}
