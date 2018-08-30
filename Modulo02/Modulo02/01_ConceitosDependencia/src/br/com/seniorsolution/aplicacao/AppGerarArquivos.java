package br.com.seniorsolution.aplicacao;

import java.io.FileWriter;
import java.util.LinkedHashSet;
import java.util.Set;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.enumeracoes.Sexo;

public class AppGerarArquivos {
	public static void main(String[] args) {
		
		
		try {
			Aluno aluno = new					
				Aluno("Antonio Carlos", 26, Sexo.MASCULINO, 123, 
					new Curso(100, "MEAN", 60));
			
			
			Set<Curso> cursosAnteriores = new LinkedHashSet<>();
			cursosAnteriores.add(new Curso(110, "SQL", 40));
			cursosAnteriores.add(new Curso(120, "HTML e CSS", 40));
			cursosAnteriores.add(new Curso(130, "Maven", 12));
			cursosAnteriores.add(new Curso(140, "NodeJS", 24));
			
			aluno.setOutrosCursos(cursosAnteriores);
			
			System.out.println(aluno.exibir());
			
			//gerar as informações deste aluno em um arquivo texto
			FileWriter writer = new 
				FileWriter("C:/Desenvolvimento_Java/aluno.txt");
			writer.write(aluno.exibir());
			writer.close(); //executa o método flush()
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
