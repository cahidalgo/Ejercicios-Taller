package com.mycompany.eps;

/**
 *
 * @author User
 */
public class Medico {
    private String nombre;
    private String espe;
    private String horario;

    public Medico(String nombre, String espe, String horario) {
        this.nombre = nombre;
        this.espe = espe;
        this.horario = horario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspe() {
        return espe;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Medico: " + "Nombre=" + nombre + ", Especializacion=" + espe + ", Horario semanal=" + horario;
    }
    
    
}
