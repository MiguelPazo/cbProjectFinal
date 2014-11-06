<%-- 
    Document   : users
    Created on : 05-Nov-2014, 16:50:27
    Author     : Miguel Pazo Sánchez (http://miguelpazo.com/)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<h3>Mantenimiento de Usuarios</h3>

<s:form action="users_save">     
    <s:hidden name="objUser.id" />
    <s:textfield label="Nombres" name="objUser.name" required="true" />
    <s:textfield label="Apellidos" name="objUser.lastname" required="true" />
    <s:textfield label="Usuario" name="objUser.user" required="true" />
    <s:password label="Contraseña" name="objUser.password" required="true" />
    <s:select label="Perfil" list="lstUserProfile" listKey="id" listValue="description" name="objUser.profile" />

    <s:submit value="Guardar"/>
    <a href="<s:url action="users" />">Cancelar</a>
</s:form>