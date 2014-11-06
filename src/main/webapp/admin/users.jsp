<%-- 
    Document   : users
    Created on : 05-Nov-2014, 16:50:27
    Author     : Miguel Pazo Sánchez (http://miguelpazo.com/)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<div class="container">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-10 col-md-offset-1">
                <h3>Lista de Usuarios</h3>

                <table class="table table-condensed">
                    <tr>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>Usuario</th>
                        <th>Perfil</th>
                        <th>Opciones</th>
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
                            <td>
                                <a href="<s:url action="users_maintenance">
                                       <s:param name="id" value="id" />
                                   </s:url>" class="btn btn-success btn-circle">
                                    <span class='glyphicon glyphicon-pencil'></span>
                                </a>
                                <a href="<s:url action="users_delete">
                                       <s:param name="id" value="id" />
                                   </s:url>" class="btn btn-success btn-circle">
                                    <span class='glyphicon glyphicon-trash'></span>
                                </a>
                            </td>
                        </tr>
                    </s:iterator>
                </table>

                <a href="<s:url action="main_menu"/>" class="btn btn-primary">
                    <span class='glyphicon glyphicon-arrow-left'></span>
                    Menu Principal
                </a>
                <a href="<s:url action="users_maintenance"/>" class="btn btn-success">
                    <span class='glyphicon glyphicon-user'></span>
                    Nuevo Usuario
                </a>
            </div>
        </div>
    </div>
</div>

