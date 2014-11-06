<%-- 
    Document   : users
    Created on : 05-Nov-2014, 16:50:27
    Author     : Miguel Pazo Sánchez (http://miguelpazo.com/)
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<h3>Mantenimiento de Programas</h3>

<s:form action="programs_save">        
    <s:textfield label="Título" name="objProgram.title" required="true" />
    <s:textfield label="Descripción" name="objProgram.description" required="true" />
    <s:textfield label="Objetivos" name="objProgram.goal" required="true" />
    <s:textfield label="Requisitos" name="objProgram.requirements" required="true" />
    <s:textfield label="Precio" name="objProgram.price" required="true" />
    <s:textfield label="Duración (días)" name="objProgram.duration" required="true" />
    <s:radio label="Estado" name="objProgram.status" list="lstProgramStatus" listKey="id" listValue="description" required="true" />

    <s:submit value="Guardar"/>
    <a href="<s:url action="programs" />">Cancelar</a>
</s:form>