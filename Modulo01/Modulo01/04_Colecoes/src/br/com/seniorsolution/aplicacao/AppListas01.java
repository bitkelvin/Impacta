package br.com.seniorsolution.aplicacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppListas01 {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Danilo");
		nomes.add("Pessoa1");
		nomes.add("Pessoa2");
		
		nomes.add(0, "Fabio");
		
		nomes.remove(1);
		
		nomes.add("Joaquim");
		nomes.add("Adriano");
		nomes.add("Mario");
		
		nomes.remove("Danilo");
		
		Collections.sort(nomes);
		
		for (String item : nomes) {
			System.out.println(item);
		}
	}
}
