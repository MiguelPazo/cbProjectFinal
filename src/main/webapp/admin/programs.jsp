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
            <div class="col-md-12">
                <h3>Lista de Programas</h3>

                <table class="table table-condensed">
                    <tr>
                        <th>Título</th>
                        <th>Descripción</th>
                        <th>Objetivos</th>
                        <th>Requisitos</th>
                        <th>Precio</th>
                        <th>Duración</th>
                        <th>Estado</th>
                        <th>Opciones</th>
                    </tr>
                    <s:iterator value="lstProgram">
                        <tr><td><s:property value="title"/></td>
                            <td><s:property value="description"/></td>
                            <td><s:property value="goal"/></td>
                            <td><s:property value="requirements"/></td>
                            <td><s:property value="price"/></td>
                            <td><s:property value="duration"/></td>
                            <td>
                                <s:if test="status == 1" >
                                    Activo
                                </s:if>
                                <s:else>
                                    Inactivo
                                </s:else>
                            </td>
                            <td>
                                <a href="<s:url action="programs_maintenance">
                                       <s:param name="id" value="idProgram" />
                                   </s:url>" class="btn btn-success btn-circle">
                                    <span class='glyphicon glyphicon-pencil'></span>
                                </a>
                                <a href="<s:url action="programs_delete">
                                       <s:param name="id" value="idProgram" />
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

                <a href="<s:url action="programs_maintenance"/>" class="btn btn-success">
                    <span class='glyphicon glyphicon-briefcase'></span>
                    Nuevo Programa
                </a>
            </div>
        </div>
    </div>
</div>

