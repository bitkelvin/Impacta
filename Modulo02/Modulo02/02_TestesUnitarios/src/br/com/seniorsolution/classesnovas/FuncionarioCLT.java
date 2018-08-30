package br.com.seniorsolution.classesnovas;

import br.com.seniorsolution.classes.Funcionario;
import br.com.seniorsolution.enumeracoes.Sexo;

public class FuncionarioCLT extends Funcionario {
	
	private double impostoRenda;
	
	public double getImpostoRenda() {
		return impostoRenda;
	}

	public FuncionarioCLT (
			String nome, 
			int idade, 
			Sexo sexo, 
			String cpf, 
			String cargo,
			double salario) throws IllegalAccessException {
		super(nome, idade, sexo,cpf,cargo,salario);
	}
	
	private double calcularIRPF(){
		double imposto = 0;
		
		double[] taxas   = {0, 7.5, 15, 22.5, 27.5};
		double[] valores = {0, 1903.98, 2826.65, 3751.05, 4664.68};
		
		double baseCalculo = this.getSalario();
		
		for (int i = taxas.length - 1; i >= 0; i--) {
			if(baseCalculo > valores[i]){
				imposto += (baseCalculo - valores[i]) * taxas[i] / 100;
				baseCalculo = valores[i];
			}
		}		
		return imposto;
	}
	
	@Override
	public void setSalario(double salario){
		super.setSalario(salario);
		this.impostoRenda = this.calcularIRPF();
	}
	
	@Override
	public String exibir(){
		return super.exibir() + 
				"\n\nIRPF: " + this.getImpostoRenda();
	}

}
