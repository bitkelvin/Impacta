package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Pessoa;
import br.com.seniorsolution.enumeracoes.Sexo;

public class AppExcecoes {
	public static void main(String[] args) {
		try {
			
			Pessoa p = new Pessoa("", -21, Sexo.MASCULINO);
			JOptionPane.showMessageDialog(null, p.exibir());
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}catch(IllegalArgumentException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
}
