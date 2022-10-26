package com.mycompany.eps;

/**
 *
 * @author User
 */
public class Cita {
    private String nombre;
    private int cedula;
    private String medico;
    private String hora;
    private String dia;
    private String tipo;

    public Cita(String nombre, int cedula, String medico, String hora, String dia, String tipo) {
        this.medico = medico;
        this.hora = hora;
        this.dia = dia;
        this.tipo = tipo;
        this.nombre=nombre;
        this.cedula=cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public String getMedico() {
        return medico;
    }

    public String getHora() {
        return hora;
    }

    public String getDia() {
        return dia;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Cita: " + "Nombre del medico=" + medico + ", Hora=" + hora + ", Dia=" + dia + ", Tipo de cita=" + tipo;
    }
    
    public String toString2(){
        return "Cita: " + "Nombre del paciente=" + nombre + "Cedula del paciente="+ cedula+ ", Hora=" + hora + ", Dia=" + dia + ", Tipo de cita=" + tipo;
    }
}
