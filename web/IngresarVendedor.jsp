<%-- 
    Document   : IngresarVendedor
    Created on : 02-nov-2018, 12:47:41
    Author     : Renato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar Vendedor</title>
        <link href="css/bootstrap.min.css" rel="stylesheet"> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
        <div class="card">
            <div class="card-body bg-info text-white">
                Ingreso de Vendedor
            </div> 
            <div class="card-body">
                <form method="get" action="InsertarVendedor" name="InsertarVendedor">
                    <div class="form-group">
                        <label form="ExampleInputEmaill">OPERACION</label>
                        <input type="text" class="form-control" name="txt1" id="txt1" placeholder="Ingrese operacion">
                    </div>
                    <div class="form-group">
                         <label form="ExampleInputEmaill">CODIGO DEL VENDEDOR</label>
                         <input type="text" class="form-control" name="txt2" id="txt2" placeholder="Ingrese codigo del vendedor">
                    </div>
                    <div class="form-group">
                        <label form="ExampleInputEmaill">CODIGO DE ZONA</label>
                        <input type="text" class="form-control" name="txt3" id="txt3" placeholder="Ingrese codigo de zona">
                    </div>
                    <div class="form-group">
                        <label form="ExampleInputEmaill">NOMBRE DEL VENDEDOR</label>
                        <input type="text" class="form-control" name="txt4" id="txt4" placeholder="Ingrese nombre ">
                    </div>
                    <div class="form-group">
                        <label form="ExampleInputEmail">APELLIDO DEL VENDEDOR</label>
                        <input type="text" class="form-control" name="txt5" id="txt5" placeholder="Ingrese apellido">
                    </div>
                     <div class="form-group">
                        <label form="ExampleInputEmail">DIRECCION DEL VENDEDOR</label>
                        <input type="text" class="form-control" name="txt6" id="txt6" placeholder="Ingrese direccion">
                    </div>
                     <div class="form-group">
                        <label form="ExampleInputEmail">TELEFONO DEL VENDEDOR</label>
                        <input type="text" class="form-control" name="txt7" id="txt7" placeholder="Ingrese telefono">
                    </div>
                     <div class="form-group">
                        <label form="ExampleInputEmail">EMAIL DEL VENDEDOR</label>
                        <input type="text" class="form-control" name="txt8" id="txt8" placeholder="Ingrese email">
                    </div>
                    
                     <button type="submit" class="btn btn-info">INGRESA</button>
                   <a href="Formulario.jsp" class="btn btn-dark" >Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
