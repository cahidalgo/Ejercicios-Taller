package com.mycompany.catalogo;

/**
 *
 * @author User
 */
public class Domicilio implements TipoEnvio{
    
    @Override
    public String envio(){
        String s="Se llevara el producto a la casa del cliente";
        return s;
    }
    
}
