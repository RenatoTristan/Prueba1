/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import CONEXION.Conexion;
import Entidad.Vendedor;
import Entidad.Ventas;
import Entidad.Zona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Renato
 */
public class Negocio {
   public void insertazona(Zona z){
try{
Connection cnx=Conexion.getConnection();
PreparedStatement pst=cnx.prepareStatement("{call pa_zona(?,?,?)}");       

pst.setString(1,z.getOpcion());
pst.setInt   (2,z.getCodigo_zona());
pst.setString(3,z.getNombre_zona());
pst.executeUpdate();
}
catch (SQLException ex){
/*System.out.println(ex.getMessage());*/

}
   }
   
   public void insertarvendedor(Vendedor v){
       try {
           Connection cnx=Conexion.getConnection();
PreparedStatement pst=cnx.prepareStatement("{call pa_vendedor(?,?,?,?,?,?,?,?)}");       

pst.setString(1,v.getOpcion());
pst.setInt   (2,v.getCod_vend());
pst.setInt   (3,v.getCodigo_zona());
pst.setString(4,v.getNombre());
pst.setString(5,v.getApellido());
pst.setString(6,v.getDireccion());
pst.setString(7,v.getTelefono());
pst.setString(8,v.getEmail());
pst.executeUpdate();
           
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
       }
       
   }
   
   public void insertarventas(Ventas ve){
       try {
           Connection cnx=Conexion.getConnection();
PreparedStatement pst=cnx.prepareStatement("{call pa_venta(?,?,?,?,?)}");       
pst.setString(1,ve.getOpciones());
pst.setInt   (2,ve.getCod_ventas());
pst.setInt   (3,ve.getCod_vendedor());
pst.setString(4,ve.getFecha());
pst.setInt(5,ve.getMonto());
pst.executeUpdate();
           
       } catch (Exception ex) {
           System.out.println(ex.getMessage());
       }
       
   }
   }

   
