package br.com.seniorsolution.aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.classes.CursoGraduacao;
import br.com.seniorsolution.classes.CursoPos;

public class AppListas02 {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		
		try {
			cursos.add(new Curso(10, "Servidor Linux", 80));
			cursos.add(new CursoPos(20, "Backoffice", 100, 5));
			cursos.add(new Curso(30, "Android", 100));
			cursos.add(new CursoGraduacao(40, "Sistemas de Informação", 3000, 8));
			
			System.out.println(cursos);
			
			Collections.sort(cursos);
			
			System.out.println(cursos);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
