/**
 *  Javascript Exemplo
 */

$(document).ready(function(){
	$("#botao").click(function(){
		var nome = $("#nome").val();
		var idade = $("#idade").val();
		
		var resultado = "Dados Cadastrais: " + "<br/>" + 
		"Nome: " + nome + "<br/>" +
		"Idade: " + idade;
		
		if(idade < 18){
			resultado += "<br/>Você é menor de idade";
		}else{
			resultado += "<br/>Você é maior de idade";
		}
		
		$("#resultado").html(resultado);
	});
});