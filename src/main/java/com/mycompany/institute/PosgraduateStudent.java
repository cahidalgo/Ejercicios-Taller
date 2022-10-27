package com.mycompany.institute;

/**
 *
 * @author Andres Gomez
 */
public class PosgraduateStudent extends Estudiante {
    private String nom;
    private String cedula;
    private String sexo;
    private int cred;
    private double calculo;
    private double fisica;
    private double estadistica;
    private TipoMatricula tipomatricula;

    public PosgraduateStudent(String nom, String cedula, String sexo) {
        this.nom = nom;
        this.cedula = cedula;
        this.sexo = sexo;
        this.setTipomatricula(new MatriculaPos());
    }

    public TipoMatricula getTipomatricula() {
        return tipomatricula;
    }

    @Override
    public void setTipomatricula(TipoMatricula tipomatricula) {
        this.tipomatricula = tipomatricula;
    }

    @Override
    public void setCred(int cred) {
        this.cred = cred;
    }

    @Override
    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }

    @Override
    public void setFisica(double fisica) {
        this.fisica = fisica;
    }

    @Override
    public void setEstadistica(double estadistica) {
        this.estadistica = estadistica;
    }

    public String getCedula() {
        return cedula;
    }

    public String getSexo() {
        return sexo;
    }
    

    public String getNom() {
        return nom;
    }

    public int getCred() {
        return cred;
    }
    
    
    public double calcularProm(double cal,double fis,double estad){
        double x=0;
        return x=(cal+fis+estad)/3;   
    }
    
    
    @Override
    public String toString() {
        return "PosgraduateStudent{" + "nom=" + nom + ", cedula=" + cedula + ", sexo=" + sexo + ", cred=" + cred + ", calculo=" + calculo + ", fisica=" + fisica + ", estadistica=" + estadistica + '}';
    }
}
