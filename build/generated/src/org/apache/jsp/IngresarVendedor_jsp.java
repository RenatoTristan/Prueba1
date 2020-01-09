package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class IngresarVendedor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ingresar Vendedor</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\"> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"card-body bg-info text-white\">\n");
      out.write("                Ingreso de Vendedor\n");
      out.write("            </div> \n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <form method=\"get\" action=\"InsertarVendedor\" name=\"InsertarVendedor\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label form=\"ExampleInputEmaill\">OPERACION</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txt1\" id=\"txt1\" placeholder=\"Ingrese operacion\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                         <label form=\"ExampleInputEmaill\">CODIGO DEL VENDEDOR</label>\n");
      out.write("                         <input type=\"text\" class=\"form-control\" name=\"txt2\" id=\"txt2\" placeholder=\"Ingrese codigo del vendedor\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label form=\"ExampleInputEmaill\">CODIGO DE ZONA</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txt3\" id=\"txt3\" placeholder=\"Ingrese codigo de zona\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label form=\"ExampleInputEmaill\">NOMBRE DEL VENDEDOR</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txt4\" id=\"txt4\" placeholder=\"Ingrese nombre \">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <label form=\"ExampleInputEmail\">APELLIDO DEL VENDEDOR</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txt5\" id=\"txt5\" placeholder=\"Ingrese apellido\">\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label form=\"ExampleInputEmail\">DIRECCION DEL VENDEDOR</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txt6\" id=\"txt6\" placeholder=\"Ingrese direccion\">\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label form=\"ExampleInputEmail\">TELEFONO DEL VENDEDOR</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txt7\" id=\"txt7\" placeholder=\"Ingrese telefono\">\n");
      out.write("                    </div>\n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                        <label form=\"ExampleInputEmail\">EMAIL DEL VENDEDOR</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"txt8\" id=\"txt8\" placeholder=\"Ingrese email\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                     <button type=\"submit\" class=\"btn btn-info\">INGRESA</button>\n");
      out.write("                   <a href=\"Listado de Vendedores.jsp\" class=\"btn btn-dark\" >LISTADO</a>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
