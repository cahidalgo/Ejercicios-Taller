package com.mycompany.institute;

/**
 *
 * @author User
 */
public class MatriculaPos implements TipoMatricula{
    
    @Override
    public double calcularMat(int cred){
        double mat;
        return mat=cred*200000;
    }
}
