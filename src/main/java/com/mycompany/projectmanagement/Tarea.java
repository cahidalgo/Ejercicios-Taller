/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmanagement;

/**
 *
 * @author Andres Gomez
 */
public class Tarea {
    
    private int t;
    private int com;
    private double costo;
    private String nom;
    private String estado;
    
    public Tarea() {
    }

    
    public Tarea(String nom,int t,int com, double costo,String estado) {
        this.nom = nom;
        this.t = t;
        this.com = com;
        this.costo = costo;
        this.estado = estado;
    }

    public int getCom() {
        return com;
    }

    public String getNom() {
        return nom;
    }

    public int getT() {
        return t;
    }

    public double getCosto() {
        return costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    

    public void setT(int t) {
        this.t = t;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public double compleMin(int t){
        double resul=0;
        return resul=t*25;
    }
    
    public double compleMed(int t){
        double resul=0;
        return resul=(t*25)+(0.05*(t*25));
    }
    
    public double compleMax(int t){
        double resul=0;
        if(t<=10){
            return resul=(t*25)+(0.07*(t*25));
        }else{
            double drest=t-10;
            return resul=(t*25)+(0.07*(t*25))+(10*drest);
        }
    }

    @Override
    public String toString() {
        return "Tarea{" + "t=" + t + ", com=" + com + ", costo=" + costo + ", nom=" + nom + ", estado=" + estado + '}';
    }
    
}
