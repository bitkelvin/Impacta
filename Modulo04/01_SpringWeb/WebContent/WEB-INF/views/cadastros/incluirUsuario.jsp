<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>::Cadastro de Usuários</title>
</head>
<body>
	<h1>Login</h1>
		<form action=<c:url value="/cadusuario"/> method="post">
		<label>Usuário:</label><br/>
		<input type="text" name="nome" size="20" /><br/>
		
		<label>Endereço:</label><br/>
		<input type="text" name="senha" size="20" /><br/>
				
		<select name="nivel">
			<option value="1">Administrador</option>
			<option value="2">Professor</option>
			<option value="3">Aluno</option>
		</select>
		<br/>
		<input type="submit" value="Incluir Usuario">
	</form>
	${mensagem}
</body>
</html>