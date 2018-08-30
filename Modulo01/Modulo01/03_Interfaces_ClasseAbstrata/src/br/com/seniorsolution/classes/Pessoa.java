package br.com.seniorsolution.classes;

import br.com.seniorsolution.enumeracoes.Sexo;

public abstract class Pessoa {

	private int id;	//identificador para o objeto, apenas
	private String nome;
	private int idade;
	private Sexo sexo;
	private Endereco endereco;
	
	private static int CONTADOR = 1;
	
	//construtor: deve ter o mesmo nome da classe, sem tipo de retorno
	//especificado.
	//Se nenhum construtor for inclu�do na classe, o compilador
	//insere o construtor padr�o (sem parametros), cujo objetivo � 
	//atribuir valores default para os atributos.
	//Quando o usu�rio colocar pelo menos um construtor na classe,
	//o compilador o utilizar�, e deixar� de inserir seu construtor
	//padr�o.
	
	public Pessoa(String nome){
		this.setId(CONTADOR++);
		this.setNome(nome);
	}	
	public Pessoa(String nome, int idade){
		this(nome);
		this.setIdade(idade);
	}	
	public Pessoa(String nome, int idade, Sexo sexo){
		this(nome, idade);
		this.setSexo(sexo);
	}	
	public Pessoa(String nome, int idade, Sexo sexo, Endereco endereco){
		this(nome, idade, sexo);
		this.setEndereco(endereco);
	}
	
	public int getId() {
		return id;
	}
	
	private void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome == null || nome.trim().equals("")){
			throw new IllegalArgumentException("Nome n�o pode estar vaz�o ou nulo.");
		}
		
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if(idade < 0){
			throw new NumberFormatException("Idade n�o pode ser negativa");
		}
		
		this.idade = idade;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		if(endereco == null){
			throw new NullPointerException("Endere�o inv�lido");
		}
		
		this.endereco = endereco;
	}
	
	
	
	public String exibir(){
		return exibir("DADOS PESSOAIS");
	}
	
	public String exibir(String titulo){		
		
		String resposta = titulo +
						  "\n\nID: " + this.getId() +
					      "\nNome: " + this.getNome() +
						  "\nIdade: " + this.getIdade() +
						  "\nSexo: " + this.getSexo();
		
			if(this.getEndereco() != null){
						  resposta += "\n\nENDERE�O: \n" +
						  	this.getEndereco().exibir();
			}
		
		return resposta;		
	}	
}







