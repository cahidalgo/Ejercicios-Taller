package com.mycompany.catalogo;
/**
 *
 * @author User
 */
public abstract class Producto {
    
    TipoPago tipopago;
    TipoEnvio tipoenvio;

    public void setTipopago(TipoPago tipopago) {
        this.tipopago = tipopago;
    }

    public void setTipoenvio(TipoEnvio tipoenvio) {
        this.tipoenvio = tipoenvio;
    }
    
    public void formaPago(){
        tipopago.pago();
    }
    
    public void formaEnvio(){
        tipoenvio.envio();
    }
    
}
