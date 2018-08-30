<!DOCTYPE html>
<%@page import="br.com.seniorsolution.entidades.Cliente"%>
<%@page import="java.util.List"%>
<%@page import="br.com.seniorsolution.dao.GenericDao"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro de Endereços</title>
	</head>
	<body>
	 	<h1>Cadastro de Endereços</h1>
		<a href="index.jsp">Voltar</a><br/>
		<form action="enderecos" method="post">
			<label for="cliente">Cliente:</label><br/>
			
			<!-- nisso ficam instruções java - scriptlet -->
			<% 
				GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
				List<Cliente> clientes =dao.listar();
			%>
			
			<select name="cliente">
				<% for(Cliente item: clientes){ %>
					<option value="<%=item.getId()%>"><%=item.getEmpresa() %></option>
				<%} %>
			</select><br/>
			<label for="rua">Rua:</label><br/>
			<input type="text" name="rua" id="rua" size="20" maxlength="45"/><br/>
			<label for="cidade">Cidade:</label><br/>
			<input type="text" name="cidade" id="cidade" size="20" maxlength="45"/><br/>
			<label for="cep">CEP:</label><br/>
			<input type="text" name="cep" id="cep" size="20" maxlength="10"/><br/>
			
			<input type="submit" value="Enviar">
		</form>
		
			${mensagem}
	</body>
</html>