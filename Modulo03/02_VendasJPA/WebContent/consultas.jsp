<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Consultas</title>
	</head>
	<body>
		<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<jsp:useBean id="beanVendas" class="br.com.seniorsolution.beans.BeanVendas"></jsp:useBean>
		<h1>Consultas a pedidos e itens</h1>
		<a href="index.jsp">Voltar</a><br/>
		<fieldset>
			<legend>Tipos de Consulta</legend>
			<form action="consultas" method="post">
				<input type="radio" name="opcao" value="pedidos" checked="checked">
							Pedidos por cliente<br/>
				<input type="radio" name="opcao" value="itens">Itens por pedido<br/>
				
				<label for="cliente">Clientes:</label><br/>
				<select name="cliente">
					<c:forEach	var="item" items="${beanVendas.listaClientes }">
						<option value="${item.id }">${item.empresa }</option>
					</c:forEach>
				</select><br/>
				
				<label for="pedido">Pedido:</label><br/>
				<select name="pedido">
					<c:forEach var="item" items="${beanVendas.listaPedidos}">
						<option value="${item.pedidoPK}">${item.pedidoPK}</option> 
					</c:forEach>
				</select><br/>
				<input type="submit" value="Consultar">
			</form> 
		</fieldset>
		
		${mensagem}
		${resposta}

	</body>
</html>