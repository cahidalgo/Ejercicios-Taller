
package com.mycompany.interfaz;

/**
 *
 * @author sala4
 */
public class Mp3 extends Producto{
    
    private int precio;
    private int codigo;
    private int cant;
    private String marca;
    private TipoPago tipopago;
    private TipoEnvio tipoenvio;

    public Mp3(int precio, int codigo, int cant, String marca) {
        this.precio = precio;
        this.codigo = codigo;
        this.cant = cant;
        this.marca = marca;
        this.tipopago=new Efectivo();
        this.tipoenvio=new Tienda();
    }
    @Override
    public void setTipopago(TipoPago tipopago) {
        this.tipopago = tipopago;
    }
    @Override
    public void setTipoenvio(TipoEnvio tipoenvio) {
        this.tipoenvio = tipoenvio;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCant() {
        return cant;
    }

    public String getMarca() {
        return marca;
    }

    public TipoPago getTipopago() {
        return tipopago;
    }

    public TipoEnvio getTipoenvio() {
        return tipoenvio;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Mp3{" + "precio=" + precio + ", codigo=" + codigo + ", marca=" + marca + '}';
    }
    
}
