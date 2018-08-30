<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Disciplinas</title>
</head>
<body>
	<h1>Inclusão de uma Nova Disciplina</h1>
	<form action=<c:url value="/caddisciplina"/> method="post">
	
		<label>Cód. Curso:</label><br /> 
		<input type="text" name="idcurso" size="10" value="${idcurso}" />
		
		<br /> 
			
		<label>Disciplina:</label><br />
		<input type="text" name="descricao" size="30" />
		<form:errors path="disciplina.descricao" />
		<br /> 
		
		<label>Carga horária:</label><br />	
		<input type="text" name="ch" size="5" />
		<form:errors path="disciplina.ch" />
		<br /> <input type="submit"
			value="Incluir Disciplina">
	</form>
</body>
</html>