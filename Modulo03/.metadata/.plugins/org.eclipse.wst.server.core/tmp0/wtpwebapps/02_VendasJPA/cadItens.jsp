<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro de Itens</title>
	</head>
	<body>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
		<jsp:useBean id="pedidoBean" class="br.com.seniorsolution.beans.BeanVendas"></jsp:useBean>
		
		<h1>Inclusão de Itens</h1>
		<a href="index.jsp">Voltar</a><br/>
		<form action="itens" method="post">
			<label for="pedido">Pedido:</label><br/>
			<select name="pedido">
				<c:forEach var="item" items="${pedidoBean.listaPedidos}">
					<option value="${item.pedidoPK}">${item.pedidoPK}</option> 
				</c:forEach>
			</select><br/>
			<label for="qtde">Quantidade:</label><br/>
			<input type="text" id="qtde" name="qtde" size="20"/><br/>
			<label for="desc">Descrição:</label><br/>
			<input type="text" id="desc" name="desc" size="20" maxlength="45"/><br/>
			<input type="submit" value="Incluir"/>		
		</form>
		${mensagem}
	</body>
</html>