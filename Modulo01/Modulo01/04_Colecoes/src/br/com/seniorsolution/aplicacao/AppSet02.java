package br.com.seniorsolution.aplicacao;

import java.util.HashSet;
import java.util.Set;

import br.com.seniorsolution.classes.Endereco;

public class AppSet02 {
	public static void main(String[] args) {
		Set<Endereco> enderecos = new HashSet<>();
		
		System.out.println(enderecos.add(new Endereco("Paulista", 1524, "São Paulo")));
		System.out.println(enderecos.add(new Endereco("Paulista", 820, "São Paulo")));
		System.out.println(enderecos.add(new Endereco("Faria Lima", 237, "São Paulo")));
		System.out.println(enderecos.add(new Endereco("Afonso Penha", 360, "Campo Grande")));
		System.out.println(enderecos.add(new Endereco("Presidente Vargas", 1000, "Rio de Janeiro")));
		System.out.println(enderecos.add(new Endereco("15 de Novembro", 910, "Curitiba")));
		System.out.println(enderecos.add(new Endereco("Bela Cintra", 347, "São Paulo")));
		
		for (Endereco endereco : enderecos) {
			System.out.println(endereco);
			System.out.println(endereco.hashCode());
		}
	}
}
