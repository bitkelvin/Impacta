package br.com.seniorsolution.interfaces;

public interface IFigura {
	/*
	 * Todo o método de interface é publico e abstrato por definição
	 */
	
	double calcularArea();

	/*
	 * Todo atributo de interface é public, static e final por definição
	 */
	
	String INFORMACOES = "Interface usada para gerar figuras";
	//public static final String INFORMACOES = "";
}
