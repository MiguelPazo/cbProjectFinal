<%-- 
    Document   : users
    Created on : 05-Nov-2014, 16:50:27
    Author     : Miguel Pazo Sánchez (http://miguelpazo.com/)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<h1>Ingreso al Sistema</h1>

<s:form name="loginForm" action="j_spring_security_check" method="post">           
    <s:textfield label="Usuario" name="j_username"/>
    <s:password label="Contraseña" name="j_password"/>

    <s:submit value="Ingresar"  />
</s:form>