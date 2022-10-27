package com.mycompany.catalogo;

/**
 *
 * @author User
 */
public class Cd extends Producto{
    private int precio;
    private int codigo;
    private int cant;
    private String titulo;
    private String interprete;
    private TipoPago tipopago;
    private TipoEnvio tipoenvio;
   
    public Cd(int precio, int codigo,int cant, String titulo, String interprete) {
        this.precio = precio;
        this.codigo = codigo;
        this.cant=cant;
        this.titulo = titulo;
        this.interprete = interprete;
        this.tipopago=new Efectivo();
        this.tipoenvio=new Tienda();
    }

    public TipoPago getTipopago() {
        return tipopago;
    }

    @Override
    public void setTipopago(TipoPago tipopago) {
        this.tipopago = tipopago;
    }

    public TipoEnvio getTipoenvio() {
        return tipoenvio;
    }

    @Override
    public void setTipoenvio(TipoEnvio tipoenvio) {
        this.tipoenvio = tipoenvio;
    }

    
    public int getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInterprete() {
        return interprete;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getCant() {
        return cant;
    }

    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", codigo=" + codigo + ", titulo=" + titulo + ", interprete=" + interprete + '}';
    }
    
    
}
