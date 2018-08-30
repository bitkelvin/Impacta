package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Funcionario;
import br.com.seniorsolution.classesnovas.FuncionarioCLT;
import br.com.seniorsolution.enumeracoes.Sexo;

public class AppFuncionarioCLT {
	public static void main(String[] args) {
		try {
			Funcionario f = 
				new FuncionarioCLT(
					"Jair", 
					45, 
					Sexo.MASCULINO, 
					"11122233345", 
					"Gerente", 11855);
			
			JOptionPane.showMessageDialog(null, f.exibir());
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
