package br.com.seniorsolution.aplicacao;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppSet03 {
	public static void main(String[] args) {
		Set<String> nomes = new LinkedHashSet<>();
		
		nomes.add("Danilo");
		nomes.add("B�rbara");
		nomes.add("Bruno");
		nomes.add("Din�h");
		nomes.add("Ivane");
		nomes.add("Jos�");
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
	}
}
