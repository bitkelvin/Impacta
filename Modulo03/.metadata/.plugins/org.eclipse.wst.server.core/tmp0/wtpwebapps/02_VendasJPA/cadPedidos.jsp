<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro de Pedidos</title>
	</head>
	<body>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<jsp:useBean id="clienteBean" class="br.com.seniorsolution.beans.BeanVendas"></jsp:useBean>
		<h1>Cadastro de Pedidos</h1>
		<a href="index.jsp">Voltar</a><br/>
		<form action="pedidos" method="post">
			
			<label for="cliente">Cliente:</label><br/>
			<select name="cliente">
				<c:forEach var="item" items="${clienteBean.listaClientes}">
					<option value="${item.id}">${item.empresa}</option>
				</c:forEach>
			</select><br/>
			
			<!-- no for do label vai o id -->
			<label for="numpedido">Nº do pedido:</label><br/>
			<input type="text" name="numpedido" id="numpedido" size="20" maxlength="45"/><br/>
			
			<label for="categoria">Categoria:</label><br/>
			<select name="categoria">
				<option value="vestuario">Vestuário</option>
				<option value="alimentacao">Alimentação</option>
				<option value="material">Material escolar</option>
				<option value="outros">Outros</option>
			</select><br/>
			
			<label for="data">Data:</label><br/>
			<input type="text" name="data" id="data" size="20" maxlength="10"/><br/>
			
			<input type="submit" value="Enviar">
		</form>
		${mensagem}
	</body>
</html>