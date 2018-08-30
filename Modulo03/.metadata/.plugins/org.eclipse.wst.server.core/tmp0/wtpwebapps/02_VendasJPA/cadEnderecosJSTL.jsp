 <!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro de Endereços - JSTL</title>
	</head>
	<body>
	<!-- taglib core: usada pra laço de repetição, etc -->
	<!-- outras taglibs: sql, format (tipo datas), xml -->
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<jsp:useBean id="clienteBean" class="br.com.seniorsolution.beans.BeanVendas"></jsp:useBean>
		
		<h1>Cadastro de Endereços - JSTL</h1>
		<a href="index.jsp">Voltar</a><br/>
		<form action="enderecos" method="post">
			
			<label for="cliente">Cliente:</label><br/>
			<select name="cliente">
				<c:forEach var="item" items="${clienteBean.listaClientes}">
				<!-- propriedades: tudo que foi declarado com getters e setters -->
					<option value="${item.id}">${item.empresa}</option>
				</c:forEach>
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