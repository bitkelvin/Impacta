package br.com.seniorsolution.aplicacao;

import java.util.Set;
import java.util.TreeSet;

public class AppSet04 {
	public static void main(String[] args) {
		Set<String> nomes = new TreeSet<>();
		nomes.add("Danilo");
		nomes.add("B�rbara");
		nomes.add("Bruno");
		nomes.add("Din�h");
		nomes.add("Ivane");
		nomes.add("Jos�");
		
		for (String item : nomes) {
			System.out.println(item);
		}
	}
}
