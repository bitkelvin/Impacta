<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Cadastro de Clientes</title>
	</head>
	<body>
		<h1>Cadastro de Clientes</h1>
		
		<a href="index.jsp">Voltar</a><br/>
		<!-- no action � o mapping (sem a barra) -->
		<form action="clientes" method="post">
			<label for="codigo">C�digo:</label><br/>
			<input type="text" name="codigo" id="codigo" size="5"/>
			<!-- padroniza��o html5 exige a barra no final ali --><br/>
			
			<label for="empresa">Empresa:</label><br/>
			<input type="text" name="empresa" id="empresa" size="20"/><br/>
			
			<input type="submit" value="Enviar">
		
		</form>
		<!-- mensagem: Expression Language (usado em java web) s� aparece se tiver algum valor-->
		${mensagem}
	</body>
</html>