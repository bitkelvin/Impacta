package br.com.seniorsolution.aplicacao;

import java.util.HashMap;
import java.util.Map;

public class AppMap01 {
	public static void main(String[] args) {
		Map<Integer, String> nomes = new HashMap<>();
		nomes.put(125, "Fabiana");
		nomes.put(300, "Bárbara");
		nomes.put(524, "Danilo");
		nomes.put(5, "Paulo");
		nomes.put(10, "Mario");
		
		System.out.println(nomes);
		
		for (Map.Entry<Integer, String> nome : nomes.entrySet()) {
			System.out.println(nome.getKey() + " - " + nome.getValue());
		}
	}
}
