package br.com.seniorsolution;

import javax.swing.JOptionPane;

public class CaixaEletronico {
	public static void main(String[] args) {
		/*
		 * Em um caixa eletrônico, estão disponiveis notas
		 * de 5, 10, 20 e 50 reais. O usuário solicita um saque.
		 * Escreva o programa de forma a mostrar o numero de 
		 * cédulas dispensadas de cada valor, levando em conta 
		 * a menor quantidade possível de cédulas.
		 */
		double valor = Double.parseDouble(
				JOptionPane.showInputDialog("Valor do saque:"));
		
		int valorSaque = (int)valor;
		
		if(valorSaque <= 0 || valorSaque % 5 != 0){
			JOptionPane.showMessageDialog(null, "Valor inválido!");
			return;
		}
		
		int q5, q10, q20, q50;
		q5 = q10 = q20 = q50 = 0;
		
		q50 = valorSaque / 50; 
		valorSaque %= 50;
		
		q20 = valorSaque / 20;
		valorSaque %= 20;
		
		q10 = valorSaque / 10;
		valorSaque %= 10;
		
		q5 = valorSaque / 5;
		
		String resultado = "Valor do saque: " + valor +
				           "\nNotas de 5: " + q5 +
				           "\nNotas de 10: " + q10 +
				           "\nNotas de 20: " + q20 +
				           "\nNotas de 50: " + q50;
		JOptionPane.showMessageDialog(null, resultado);
	}
}
