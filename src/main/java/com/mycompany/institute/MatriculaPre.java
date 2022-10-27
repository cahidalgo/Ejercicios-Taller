package com.mycompany.institute;

/**
 *
 * @author User
 */
public class MatriculaPre implements TipoMatricula{
    
    @Override
    public double calcularMat(int cred){
        double mat;
        return mat=cred*40000;
    }
}
