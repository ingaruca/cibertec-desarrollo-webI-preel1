<%-- 
    Document   : exito
    Created on : 20-abr-2018, 0:25:56
    Author     : ingarukal11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matrícula Realizada</title>
    </head>
    <body>
    <center>
        <h4>La Matrícula se ha realizado con éxito!</h4>
        
        <fieldset style="width: 700px">
            <h3>Datos del alumno</h3>
            <p>Nombre(s): <s:property value="nombres"></s:property></p>
            <p>Apellidos: <s:property value="apellidos"></s:property></p>
            <p>Fecha de Nacimiento: <s:property value="fechaNacimiento"></s:property></p>
            <p>Correo: <s:property value="correo"></s:property></p>
        </fieldset>
    </center>
    </body>
</html>
