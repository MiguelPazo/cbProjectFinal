<%-- 
    Document   : users
    Created on : 05-Nov-2014, 16:50:27
    Author     : Miguel Pazo Sánchez (http://miguelpazo.com/)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<h1>Ingreso al Sistema</h1>

<s:form action="login" namespace="/">           
    <s:textfield label="Usuario" name="objUser.user"/>
    <s:password label="Contraseña" name="objUser.password"/>
    
    <s:submit value="Ingresar"  />
</s:form>