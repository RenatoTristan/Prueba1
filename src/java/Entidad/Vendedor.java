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
public class Vendedor {
    
    
   /*   cod_vend             INTEGER NOT NULL ,
        cod_zona             INTEGER NULL ,
	nom_vend             VARCHAR2(20) NULL ,
	ape_vend             VARCHAR2(20) NULL ,
	dire_vend            VARCHAR2(20) NULL ,
	telf_vend            VARCHAR2(20) NULL ,
	email_vend           VARCHAR2(20) NULL */
    
    private int cod_vend ;
    private int Codigo_zona ;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;

   private String opcion;

    public Vendedor(int cod_vend, int Codigo_zona, String nombre, String apellido, String direccion, String telefono, String email, String opcion) {
        this.cod_vend = cod_vend;
        this.Codigo_zona = Codigo_zona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.opcion = opcion;
    }

    public Vendedor() {
    }

    public int getCod_vend() {
        return cod_vend;
    }

    public void setCod_vend(int cod_vend) {
        this.cod_vend = cod_vend;
    }

    public int getCodigo_zona() {
        return Codigo_zona;
    }

    public void setCodigo_zona(int Codigo_zona) {
        this.Codigo_zona = Codigo_zona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }
   
   
    
    
    
    
}
