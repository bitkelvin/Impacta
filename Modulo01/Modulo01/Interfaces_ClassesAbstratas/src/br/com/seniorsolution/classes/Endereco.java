package br.com.seniorsolution.classes;

public class Endereco {

	private String logradouro;
	private int numero;
	private String cidade;
	
	public Endereco(String logradouro, int numero, String cidade){
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setCidade(cidade);
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String exibir(){
		String resultado = "Logradouro: " + this.getLogradouro() +
				    	   "\nNumero: " + this.getNumero() +
				    	   "\nCidade: " + this.getCidade();
		return resultado;
	}
	
}
