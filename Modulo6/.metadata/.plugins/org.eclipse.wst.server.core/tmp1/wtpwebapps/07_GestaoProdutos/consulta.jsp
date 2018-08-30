<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta de Produtos</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="css/produtos.css" type="text/css">
</head>
<body style="padding: 20px">
	<jsp:useBean id="beanProdutos" class="br.com.seniorsolution.bean.BeanProdutos"></jsp:useBean>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	
	<header>
		<nav>
			<ul class="menu" id="menuTopo">
				<li><a href="index.jsp"><span class="glyphicon glyphicon-gift"></span></a></li>
				<li><a href="cadastro.jsp">Cadastro de Produtos</a></li>
				<li><a href="consulta.jsp">Buscar</a></li>
			</ul>
		</nav>
	</header>
	
	<h1>Consulta de Produtos</h1>
	
	<c:forEach var="item" items="${beanProdutos.listaProdutos}">
		<div class="col-md-4">
			<label><strong>${item.descricao}</strong></label>
			<ul style="background-color: lightblue; box-shadow: 5px 5px 2px #888888; border-style: solid; border-width: 1px;">
				<li>${item.codigo}</li>
				<li>${item.preco}</li>
				<li>${item.fabricante}</li>
			</ul>
		</div>
	</c:forEach>
	<footer class="footer col-md-12" style="text-align: center;">
				<p>Desenvolvido para os estagi�rios da Senior Solution</p>
				<p>Copyright 2017 - Todos os direitos reservados</p>
	</footer>
	
</body>
</html>