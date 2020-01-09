<%-- 
    Document   : Ingresar
    Created on : 27-oct-2018, 9:33:12
    Author     : Renato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar Zona</title>
         <link href="css/bootstrap.min.css" rel="stylesheet"> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
    </head>
    <body>
        <div class="card">
            <div class="card-body bg-info text-white">
                Ingreso de Zona
            </div> 
            <div class="card-body">
                <form method="get" action="Insertar" name="Insertar">
                    
                    <div class="form-group">
                        <label form="exampleInputEmaill">OPERACION</label>
                        <input type="text" class="form-control" name="txt1" id="txt1" placeholder="ingrese operacion">
                    </div>
                    <div class="form-group">
                        <label form="exampleInputEmaill">CODIGO DE ZONA</label>
                        <input type="text" class="form-control" name="txt2" id="txt2" placeholder="ingrese codigo de zona">
                    </div>
                    <div class="form-group">
                        <label form="exampleInputEmaill">NOMBRE DE LA ZONA</label>
                        <input type="text" class="form-control" name="txt3" id="txt3" placeholder="ingrese nombre de la zona">
                    </div>
                    <button type="submit" class="btn btn-info">INGRESA</button>
                   <a href="Formulario.jsp" class="btn btn-dark" >Regresar</a>
                </form>
            </div>
        </div>
    </body>
</html>
