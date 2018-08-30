package br.com.seniorsolution.aplicacao;

import java.util.Collection;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.dao.AlunosDao;

public class AppListaCursos {
	public static void main(String[] args) {
		
		AlunosDao dao = new AlunosDao();
		
		try {
			Collection<Aluno> alunos = dao.listarAlunos();
			System.out.println(alunos);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
