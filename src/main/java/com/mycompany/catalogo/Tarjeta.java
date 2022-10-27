package com.mycompany.catalogo;

/**
 *
 * @author User
 */
public class Tarjeta implements TipoPago{
    
    @Override
    public String pago(){
        String s="El cliente va a pagar con tarjeta de credito";
        return s;
    }
}
