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
                <h3>Mantenimiento de Programas</h3>

                <form action="<s:url action="programs_save" />" method="post" rol="form">
                    <div class="form-group">
                        <s:label for="objProgram.title" value="Título" cssClass="col-md-5"/>
                        <s:textfield name="objProgram.title" required="true" />
                    </div>
                    <div class="form-group">
                        <s:label for="objProgram.description" value="Descripción" cssClass="col-md-5"/>
                        <s:textfield name="objProgram.description" required="true" />
                    </div>
                    <div class="form-group">
                        <s:label for="objProgram.goal" value="Objetivos" cssClass="col-md-5"/>
                        <s:textfield name="objProgram.goal" required="true" />
                    </div>
                    <div class="form-group">
                        <s:label for="objProgram.requirements" value="Requisitos" cssClass="col-md-5"/>
                        <s:textfield name="objProgram.requirements" required="true" />
                    </div>
                    <div class="form-group">
                        <s:label for="objProgram.price" value="Precio" cssClass="col-md-5"/>
                        <s:textfield name="objProgram.price" required="true" />
                    </div>
                    <div class="form-group">
                        <s:label for="objProgram.duration" value="Duración (días)" cssClass="col-md-5"/>
                        <s:textfield name="objProgram.duration" required="true" />
                    </div>

                    <button type="submit" class="btn btn-success">
                        <span class="glyphicon glyphicon-saved"></span>
                        Guardar
                    </button>
                    <a href="<s:url action="programs" />" class="btn btn-danger">
                        <span class="glyphicon glyphicon-remove"></span>
                        Cancelar
                    </a>
                </form>                    
            </div>
        </div>
    </div>
</div>