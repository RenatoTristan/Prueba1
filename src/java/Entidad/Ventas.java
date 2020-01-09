/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Renato
 */
public class Ventas {
    /*cod_venta            INTEGER NOT NULL ,
        cod_vend             INTEGER NULL ,
	fecha_venta          DATE NULL ,
	monto_venta          INTEGER NULL */
    
    private int cod_ventas;
    private int cod_vendedor;
    private String fecha;
    private int monto;
    private String opciones;

    public Ventas(int cod_ventas, int cod_vendedor, String fecha, int monto, String opciones) {
        this.cod_ventas = cod_ventas;
        this.cod_vendedor = cod_vendedor;
        this.fecha = fecha;
        this.monto = monto;
        this.opciones = opciones;
    }

    public Ventas() {
    }

    public int getCod_ventas() {
        return cod_ventas;
    }

    public void setCod_ventas(int cod_ventas) {
        this.cod_ventas = cod_ventas;
    }

    public int getCod_vendedor() {
        return cod_vendedor;
    }

    public void setCod_vendedor(int cod_vendedor) {
        this.cod_vendedor = cod_vendedor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }

    
    
    
    
    
}
