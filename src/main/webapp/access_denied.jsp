<%-- 
    Document   : users
    Created on : 05-Nov-2014, 16:50:27
    Author     : Miguel Pazo Sánchez (http://miguelpazo.com/)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Proyecto Final</title>

        <link rel="stylesheet" href="/cbProjectFinal/css/libs/bootstrap.min.css">
        <link rel="stylesheet" href="/cbProjectFinal/css/libs/bootstrap-theme.css">
        <link rel="stylesheet" href="/cbProjectFinal/css/main.css">

        <script src="/cbProjectFinal/js/libs/jquery-1.10.2.min.js"></script>
        <script src="/cbProjectFinal/js/libs/bootstrap.min.js"></script>
        <script src="/cbProjectFinal/js/main.js"></script>
    </head>
    <body>
        <div class="bg-primary">
            <div class="container bg-primary">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-md-4 col-md-offset-4">
                            <h1>Proyecto Final</h1>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <div class="container">

            <div class="container-fluid">
                <div class="row">
                    &nbsp;
                </div>
                <div class="row">
                    <div class="col-md-12 alert alert-danger">
                        <div class="" role="alert">
                            <h1>Acceso denegado!</h1>
                        </div>
                        <a href="/cbProjectFinal/admin/main_menu" class="btn btn-default">
                            <span class='glyphicon glyphicon-arrow-left'></span>
                            Regresar
                        </a>
                    </div>

                </div>
            </div>
        </div>

    </body>
</html>
