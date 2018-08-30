package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Endereco;
import br.com.seniorsolution.classes.Pessoa;
import br.com.seniorsolution.enumeracoes.Sexo;

public class AppPessoa02 {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome:");
		
		int idade = Integer.parseInt(
				JOptionPane.showInputDialog("Informe a idade:"));
		
		Sexo sexo = (Sexo)JOptionPane.showInputDialog(
				null, 
				"Selecione o sexo", 
				"Selecionar",
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				Sexo.values(), 
				null);
		
		Endereco endereco = new Endereco("Paulista", 1009, "SP");
		
		Pessoa p1 = new Pessoa(nome, idade, sexo, endereco);
		
		JOptionPane.showMessageDialog(null, p1.exibir());
		
		
		
		
	}
}
