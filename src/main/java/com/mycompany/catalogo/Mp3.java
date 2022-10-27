/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.catalogo;

/**
 *
 * @author sala4
 */
public class Mp3 extends Producto{
    private int precio;
    private int codigo;
    private int cant;
    private String titulo;
    private TipoPago tipopago;
    private TipoEnvio tipoenvio;
   
    public Mp3(int precio, int codigo,int cant, String titulo) {
        this.precio = precio;
        this.codigo = codigo;
        this.cant=cant;
        this.titulo = titulo;
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

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getCant() {
        return cant;
    }

    @Override
    public String toString() {
        return "Mp3{" + "precio=" + precio + ", codigo=" + codigo + ", cant=" + cant + ", titulo=" + titulo + '}';
    }
    
}
