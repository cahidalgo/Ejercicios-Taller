package com.mycompany.catalogo;

/**
 *
 * @author User
 */
public class Efectivo implements TipoPago {
    
    @Override
    public String pago(){
        String s="El cliente va a pagar en efectivo";
        return s;
    }
}
