package br.com.seniorsolution;

import javax.swing.JOptionPane;

public class DiasRestantes {
	public static void main(String[] args) {
		
		int dia = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o dia:"));
		
		int mes = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o mês:"));
		
		int ano = Integer.parseInt(
				JOptionPane.showInputDialog("Informe o ano:"));
		
		int[] meses = {31, ano % 4 == 0 ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		//validações
		if(mes < 1 || mes > 12){
			JOptionPane.showMessageDialog(null, "Mês inválido");
			return;
		}
		if(dia < 1 || dia > meses[mes - 1]){
			JOptionPane.showMessageDialog(null, 
					"Dia inválido para o mês informado");
			return;
		}	
		int dias = meses[mes - 1] - dia;
		for (int i = mes; i < meses.length; i++) {
			dias += meses[i];
		}
		
		JOptionPane.showMessageDialog(null, "Restam " + dias + " dias");
	}
}






