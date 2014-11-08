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
                <h3>Ingreso al Sistema</h3>
                <form action="<s:url action="j_spring_security_check" />" method="post" rol="form">
                    <div class="form-group">
                        <label class="control-label" for="j_username">Usuario:</label>
                        <s:textfield name="j_username" cssClass="form-control required"/>
                    </div>

                    <div class="form-group">
                        <label class="control-label" for="j_password">Contraseña:</label>
                        <s:password name="j_password" cssClass="form-control required"/>
                    </div>
                    <p class="bg-danger"><s:property value="errorMessage" /></p>

                    <button type="submit" class="btn btn-default">Ingresar</button>
                </form>
            </div>
        </div>
    </div>
</div>
