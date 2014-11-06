<%-- 
    Document   : users
    Created on : 05-Nov-2014, 16:50:27
    Author     : Miguel Pazo Sánchez (http://miguelpazo.com/)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<h1>Lista de Programas</h1>

<table>
    <tr>
        <th>Título</th>
        <th>Descripción</th>
        <th>Objetivos</th>
        <th>Requisitos</th>
        <th>Precio</th>
        <th>Duración</th>
        <th>Estado</th>
    </tr>
    <s:iterator value="lstProgram">
        <tr><td><s:property value="title"/></td>
            <td><s:property value="description"/></td>
            <td><s:property value="goal"/></td>
            <td><s:property value="requirements"/></td>
            <td><s:property value="price"/></td>
            <td><s:property value="duration"/></td>
            <td><s:property value="status"/></td>
        </tr>
    </s:iterator>
</table>

<a href="<s:url action="main_menu"/>">
    Menu Principal
</a>
<br/>
<a href="<s:url action="programs_maintenance"/>">
    Nuevo Programa
</a>