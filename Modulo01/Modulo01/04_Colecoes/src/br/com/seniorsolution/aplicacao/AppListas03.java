package br.com.seniorsolution.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.seniorsolution.classes.Endereco;
import br.com.seniorsolution.classes.OrdenacaoCidade;
import br.com.seniorsolution.classes.OrdenacaoLogradouro;

public class AppListas03 {
	public static void main(String[] args) {
		List<Endereco> enderecos = new ArrayList<>();
		
		enderecos.add(new Endereco("Paulista", 1524, "São Paulo"));
		enderecos.add(new Endereco("Paulista", 820, "São Paulo"));
		enderecos.add(new Endereco("Faria Lima", 237, "São Paulo"));
		enderecos.add(new Endereco("Afonso Penha", 360, "Campo Grande"));
		enderecos.add(new Endereco("Presidente Vargas", 1000, "Rio de Janeiro"));
		enderecos.add(new Endereco("15 de Novembro", 910, "Curitiba"));
		enderecos.add(new Endereco("Bela Cintra", 347, "São Paulo"));
		
		Collections.sort(enderecos, new OrdenacaoLogradouro());
		
		for (Endereco endereco : enderecos) {
			System.out.println(endereco);
		}
		
		System.out.println("---------------------------------");
		
		Collections.sort(enderecos, new OrdenacaoCidade());
		
		for (Endereco endereco : enderecos) {
			System.out.println(endereco);
		}
	}
}
