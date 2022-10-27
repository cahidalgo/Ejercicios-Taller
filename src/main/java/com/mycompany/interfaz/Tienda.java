package com.mycompany.interfaz;

/**
 *
 * @author User
 */
public class Tienda implements TipoEnvio{
    
    @Override
    public String envio(){
        String s="El cliente decidio recoger el producto en tienda";
        return s;
    }
}
