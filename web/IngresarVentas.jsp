<%-- 
    Document   : IngresarVentas
    Created on : 02-nov-2018, 16:16:29
    Author     : Renato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar ventas</title>
        <link href="css/bootstrap.min.css" rel="stylesheet"> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
       <div class="card">
            <div class="card-body bg-info text-white">
                Ingreso de Ventas
            </div> 
            <div class="card-body">
                <form method="get" action="InsertarVentas" name="InsertarVentas">
                    
                    <div class="form-group">
                        <label form="exampleInputEmaill">OPERACION</label>
                        <input type="text" class="form-control" name="txt1" id="txt1" placeholder="ingrese operacion">
                    </div>
                    <div class="form-group">
                        <label form="exampleInputEmaill">CODIGO DE VENTAS</label>
                        <input type="text" class="form-control" name="txt2" id="txt2" placeholder="ingrese codigo de ventas">
                    </div>
                    <div class="form-group">
                        <label form="exampleInputEmaill">CODIGO DE VENDEDOR</label>
                        <input type="text" class="form-control" name="txt3" id="txt3" placeholder="ingrese codigo de vendedor">
                    </div>
                    <div class="form-group">
                        <label form="exampleInputEmaill">FECHA</label>
                        <input type="text" class="form-control" name="txt4" id="txt4" placeholder="ingrese fecha">
                    </div>
                    <div class="form-group">
                        <label form="exampleInputEmaill">MONTO</label>
                        <input type="text" class="form-control" name="txt5" id="txt5" placeholder="ingrese monto">
                    </div>
                    <button type="submit" class="btn btn-info">INGRESA</button>
                   <a href="Formulario.jsp" class="btn btn-dark" >Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
