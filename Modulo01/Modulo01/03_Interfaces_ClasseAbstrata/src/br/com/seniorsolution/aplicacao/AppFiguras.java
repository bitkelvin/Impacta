package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.figuras.Circulo;
import br.com.seniorsolution.figuras.Figura;
import br.com.seniorsolution.figuras.Retangulo;

public class AppFiguras {
	public static void main(String[] args) {
		Retangulo f1 = new Retangulo(10, 12);
		Circulo f2 = new Circulo(10);
		Figura f3 = new Retangulo(4,3);
		
		mostrarFigura(f1);
		mostrarFigura(f2);
		mostrarFigura(f3);
	}
	
	private static void mostrarFigura(Figura figura){
		String classe = figura.getClass().getSimpleName();
		
		String resultado = classe + "\nArea: " + figura.calcularArea();
		JOptionPane.showMessageDialog(null, resultado);
	}
}
