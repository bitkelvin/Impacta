package br.com.seniorsolution.aplicacao;

import java.util.HashSet;
import java.util.Set;

public class AppSet01 {
	public static void main(String[] args) {
		Set<String> nomes = new HashSet<>();
	
		System.out.println(nomes.add("Danilo"));
		System.out.println(nomes.add("B�rbara"));
		System.out.println(nomes.add("Bruno"));
		System.out.println(nomes.add("Din�h"));
		System.out.println(nomes.add("Ivane"));
		System.out.println(nomes.add("Jos�"));
		System.out.println(nomes.add("Jos�"));
		
		System.out.println("----------------------------------");
		
		for (String nome : nomes) {
			System.out.println(nome);
			System.out.println(nome.hashCode());
		}
		
		System.out.println("----------------------------------");
		
		System.out.println("Danilo".hashCode());
		System.out.println("B�rbara".hashCode());
		System.out.println("Bruno".hashCode());
		System.out.println("Din�h".hashCode());
		System.out.println("Ivane".hashCode());
		System.out.println("Jos�".hashCode());
	}
}
