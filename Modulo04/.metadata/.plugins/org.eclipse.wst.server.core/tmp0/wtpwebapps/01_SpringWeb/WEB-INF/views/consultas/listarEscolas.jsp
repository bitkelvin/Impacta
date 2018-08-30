<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Escolas</title>
</head>
<body>
	<h1>Lista de Escolas</h1>

	<table>
		<tr>
			<th>ID</th>
			<th>DESCRIÇÃO</th>
			<th>DATA FUNDAÇÃO</th>
			<th>Opções</th>
		</tr>

		<c:forEach var="escola" items="${listaEscolas}">
			<tr>
				<td>${escola.id}</td>
				<td>${escola.descricao}</td>
				<td>${escola.dataFundacao}</td>
				<td>
					<a href=<c:url value="/escola/cursos?id=${escola.id}"/>>Listar Cursos</a> |
					<a href=<c:url value="/escola/remover?id=${escola.id}"/>>Remover</a> 
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>