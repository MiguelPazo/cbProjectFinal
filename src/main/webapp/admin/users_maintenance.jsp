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
            <div class="col-md-4 col-md-offset-4">
                <h3>Mantenimiento de Usuarios</h3>

                <form action="<s:url action="users_save" />" method="post" rol="form">
                    <div class="form-group">
                        <s:label for="objUser.name" value="Nombres" cssClass="col-md-5"/>
                        <s:textfield label="" name="objUser.name" required="true" cssClass="required" />
                    </div>
                    <div class="form-group">
                        <s:label for="objUser.lastname" value="Apellidos" cssClass="col-md-5"/>
                        <s:textfield label="" name="objUser.lastname" required="true" cssClass="required" />
                    </div>
                    <div class="form-group">
                        <s:label for="objUser.user" value="Usuario" cssClass="col-md-5"/>
                        <s:textfield label="" name="objUser.user" required="true" cssClass="required" />
                    </div>
                    <div class="form-group">
                        <s:label for="objUser.password" value="Contraseña" cssClass="col-md-5"/>
                        <s:password label="" name="objUser.password" required="true" cssClass="required" showPassword="true" />
                    </div>
                    <div class="form-group">
                        <s:label for="objUser.profile" value="Perfil" cssClass="col-md-5"/>
                        <s:select label="" list="lstUserProfile" listKey="id" listValue="description" name="objUser.profile" />
                    </div>
                    <s:hidden name="objUser.id" />

                    <button type="submit" class="btn btn-success">
                        <span class="glyphicon glyphicon-saved"></span>
                        Guardar
                    </button>
                    <a href="<s:url action="users" />" class="btn btn-danger">
                        <span class="glyphicon glyphicon-remove"></span>
                        Cancelar
                    </a>
                </form>                    
            </div>
        </div>
    </div>
</div>