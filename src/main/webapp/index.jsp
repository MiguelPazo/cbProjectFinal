<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<h1>Ingreso al Sistema</h1>

<s:form action="login" namespace="/">           
    <s:textfield label="Usuario" name="objUser.user"/>
    <s:password label="Contraseña" name="objUser.password"/>
    <s:submit value="Ingresar"  />
</s:form>