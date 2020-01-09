/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidad.Vendedor;
import Negocio.Negocio;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Renato
 */
@WebServlet(name = "InsertarVendedor", urlPatterns = {"/InsertarVendedor"})
public class InsertarVendedor extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       
        Vendedor v = new Vendedor();
        
        String opciones=request.getParameter("txt1");
        int cod_v=Integer.parseInt(request.getParameter("txt2"));
        int cod_zona=Integer.parseInt(request.getParameter("txt3"));
        String nom=request.getParameter("txt4");
        String ape=request.getParameter("txt5");
        String direc=request.getParameter("txt6");
        String telf=request.getParameter("txt7");
        String email=request.getParameter("txt8");
        
        v.setOpcion(opciones);
        v.setCod_vend(cod_v);
        v.setCodigo_zona(cod_zona);
        v.setNombre(nom);
        v.setApellido(ape);
        v.setDireccion(direc);
        v.setTelefono(telf);
        v.setEmail(email);
        
        
        Negocio n = new Negocio();
        
        n.insertarvendedor(v);
        request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
