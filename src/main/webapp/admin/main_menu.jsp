<%-- 
    Document   : main_menu
    Created on : 05-Nov-2014, 17:06:44
    Author     : Miguel Pazo Sánchez (http://miguelpazo.com/)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<div class="container">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <h3>Menú Principal</h3>
                
                <a class="btn btn-primary btn-lg btn-block" href="<s:url action="users" namespace="admin"/>">
                    <span class='glyphicon glyphicon-user'></span>
                    Usuarios
                </a>
                <a class="btn btn-primary btn-lg btn-block" href="<s:url action="programs" namespace="admin"/>">
                    <span class='glyphicon glyphicon-briefcase'></span>
                    Programas
                </a>
                <a class="btn btn-default btn-lg btn-block" href="<s:url action="j_spring_security_logout" namespace="/" />">
                    <span class='glyphicon glyphicon-log-in'></span>
                    Salir
                </a>
            </div>
        </div>
    </div>
</div>
