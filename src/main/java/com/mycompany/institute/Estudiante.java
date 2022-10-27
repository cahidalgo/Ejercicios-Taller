package com.mycompany.institute;

/**
 *
 * @author User
 */
public abstract class Estudiante {
    private String nom;
    private String cedula;
    private String sexo;
    private int cred;
    private double calculo;
    private double fisica;
    private double estadistica;
    private TipoMatricula tipomatricula;
    

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCred(int cred) {
        this.cred = cred;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    public void setFisica(double fisica) {
        this.fisica = fisica;
    }

    public void setEstadistica(double estadistica) {
        this.estadistica = estadistica;
    }

    public void setTipomatricula(TipoMatricula tipomatricula) {
        this.tipomatricula = tipomatricula;
    }
    
}
