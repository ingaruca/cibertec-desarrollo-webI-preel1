<%-- 
    Document   : index
    Created on : 20-abr-2018, 0:02:11
    Author     : ingarukal11
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Matrícula</title>
    </head>
    <body>
        
    <center>
        <fieldset style="width: 500px">
        <legend>Matrícula</legend>
        <s:form action="registrar" method="post">
            <s:textfield label="Nombre(s) " name="nombres" size="50"></s:textfield>
            <s:textfield label="Apellido(s) " name="apellidos" size="50"></s:textfield>
            <s:textfield label="F. Nacimiento " name="fechaNacimiento"></s:textfield>
            <s:textfield label="Correo " name="correo"></s:textfield>
            <s:submit value="Procesar"></s:submit>            
        </s:form>
    </fieldset>    
    </center>
    </body>
</html>
