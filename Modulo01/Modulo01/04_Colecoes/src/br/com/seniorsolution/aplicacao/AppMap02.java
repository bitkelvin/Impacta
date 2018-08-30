package br.com.seniorsolution.aplicacao;

import java.util.Map;
import java.util.TreeMap;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.classes.Funcionario;
import br.com.seniorsolution.classes.Pessoa;
import br.com.seniorsolution.enumeracoes.Sexo;

public class AppMap02 {
	public static void main(String[] args) {
		Map<Pessoa, String> pessoas = new TreeMap<>();
		
		try {
			pessoas.put(
					new Aluno("João", 23, Sexo.MASCULINO, 123,
					new Curso(100, "PHP", 40)), "João PHP");
			
			pessoas.put(
					new Funcionario("Cardoso", 40, Sexo.MASCULINO, "58467911234", "Motorista", 4000),
					"Motorista");
			
			pessoas.put(
					new Funcionario("Bárbara", 18, Sexo.FEMININO, "45682137845", "Cineasta", 6000),
					"Cineasta");
			
			for (Map.Entry<Pessoa, String> pessoa : pessoas.entrySet()) {
				System.out.println(pessoa.getKey() + " - " + pessoa.getValue());
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
