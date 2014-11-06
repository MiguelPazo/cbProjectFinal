<%-- 
    Document   : main_menu
    Created on : 05-Nov-2014, 17:06:44
    Author     : Miguel Pazo Sánchez (http://miguelpazo.com/)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<a href="<s:url action="users" namespace="admin"/>">
    Usuarios
</a>
<br/>
<a href="<s:url action="programs" namespace="admin"/>">
    Programas
</a>