<%-- 
    Document   : users
    Created on : 05-Nov-2014, 16:50:27
    Author     : Miguel Pazo Sánchez (http://miguelpazo.com/)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<h1>Lista de Usuarios</h1>

<table>
    <tr>
        <th>Nombres</th>
        <th>Apellidos</th>
        <th>Usuario</th>
        <th>Perfil</th>
    </tr>
    <s:iterator value="lstUser">
        <tr>
            <td><s:property value="name"/></td>
            <td><s:property value="lastname"/></td>
            <td><s:property value="user"/></td>
            <td>
                <s:if test="profile == 1"  >
                    Administrador
                </s:if>
                <s:elseif test="profile == 2" >
                    Asistente
                </s:elseif>
                <s:else>
                    Cliente
                </s:else>
            </td>
        </tr>
    </s:iterator>
</table>

<a href="<s:url action="main_menu"/>">
    Menu Principal
</a>
<br/>
<a href="<s:url action="users_maintenance"/>">
    Nuevo Usuario
</a>