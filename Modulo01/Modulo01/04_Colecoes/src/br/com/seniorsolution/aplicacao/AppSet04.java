package br.com.seniorsolution.aplicacao;

import java.util.Set;
import java.util.TreeSet;

public class AppSet04 {
	public static void main(String[] args) {
		Set<String> nomes = new TreeSet<>();
		nomes.add("Danilo");
		nomes.add("Bárbara");
		nomes.add("Bruno");
		nomes.add("Dináh");
		nomes.add("Ivane");
		nomes.add("José");
		
		for (String item : nomes) {
			System.out.println(item);
		}
	}
}
