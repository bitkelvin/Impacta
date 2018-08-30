package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.figuras.Figura;
import br.com.seniorsolution.figuras.RetanguloImpl;
import br.com.seniorsolution.interfaces.IFigura;

public class AppInterfaceFigura {
	public static void main(String[] args) {
		
		RetanguloImpl f1 = new RetanguloImpl(10, 10);
		IFigura f2 = new RetanguloImpl(16, 15);
		
		mostrarFigura(f1);
		mostrarFigura(f2);
	}
	
	private static void mostrarFigura(IFigura figura){
		String classe = figura.getClass().getSimpleName();
		
		String resultado = classe + "\nArea: " + figura.calcularArea();
		JOptionPane.showMessageDialog(null, resultado);
	}
}
