package com.mycompany.inmueblepro;

/**
 *
 * @author User
 */
public class Usuario {
    private String nombre;
    private String sexo;
    private int cedula;
    private int edad;

    public Usuario(String nombre, String sexo, int cedula, int edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.cedula = cedula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", sexo=" + sexo + ", cedula=" + cedula + ", edad=" + edad + '}';
    }
    
    
}
