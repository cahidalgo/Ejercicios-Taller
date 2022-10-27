package com.mycompany.catalogo;
/**
 *
 * @author User
 */
public abstract class Producto {
    
    private int precio;
    private int codigo;
    private int cant;
    private String titulo;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", codigo=" + codigo + ", cant=" + cant + ", titulo=" + titulo + '}';
    }
    
    
}
