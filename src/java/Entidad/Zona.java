/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Renato
 */
public class Zona {
    private int Codigo_zona;
    private String Nombre_zona;
    private String Opcion;

    public Zona(int Codigo_zona, String Nombre_zona, String Opcion) {
        this.Codigo_zona = Codigo_zona;
        this.Nombre_zona = Nombre_zona;
        this.Opcion = Opcion;
    }

    public Zona() {
    }

    public int getCodigo_zona() {
        return Codigo_zona;
    }

    public void setCodigo_zona(int Codigo_zona) {
        this.Codigo_zona = Codigo_zona;
    }

    public String getNombre_zona() {
        return Nombre_zona;
    }

    public void setNombre_zona(String Nombre_zona) {
        this.Nombre_zona = Nombre_zona;
    }

    public String getOpcion() {
        return Opcion;
    }

    public void setOpcion(String Opcion) {
        this.Opcion = Opcion;
    }
    
    
}
