package br.com.seniorsolution.aplicacao;


import br.com.seniorsolution.classes.Endereco;
import br.com.seniorsolution.classes.Pessoa;
import br.com.seniorsolution.enumeracoes.Sexo;

public class AppPessoa {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Edson");	//1
		//p1.setNome("Edson");
		p1.setIdade(25); 
		p1.setSexo(Sexo.MASCULINO);
		p1.setEndereco(new Endereco("Av. Paulista", 1009, "São Paulo"));
		
		
		Pessoa p2 = p1;				//2
		p1 = null;					//3
		
		System.out.println(p2.exibir("INFORMAÇÕES"));
	}
}
