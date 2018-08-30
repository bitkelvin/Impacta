package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.classes.CursoGraduacao;
import br.com.seniorsolution.classes.CursoPos;

public class AppCursos {
	public static void main(String[] args) {

	try {
		Curso curso = new Curso(10, "Java", 0);
		curso.setCodigo(10);
		curso.setDescricao("Java");
		curso.setCargaHoraria(100);
		
		JOptionPane.showMessageDialog(null, curso.exibir());
		
		CursoGraduacao cursoGraduacao = new CursoGraduacao(20, "Engenharia", 4000, 10);
		cursoGraduacao.setCodigo(20);
		cursoGraduacao.setDescricao("Engenharia");
		cursoGraduacao.setCargaHoraria(4000);
		cursoGraduacao.setNumSemestres(10);
		
		JOptionPane.showMessageDialog(null, cursoGraduacao.exibir());
		
		Curso curso2 = new CursoGraduacao(30, "Psicologia", 3200, 8);
		curso2.setCodigo(30);
		curso2.setDescricao("Psicologia");
		curso2.setCargaHoraria(3200);
		
		//e para atribuir valor para o numero de semestres? Cast
		CursoGraduacao cursoG2 = (CursoGraduacao)curso2;
		cursoG2.setNumSemestres(8);
		
		//executando de forma direta
		((CursoGraduacao)curso2).setNumSemestres(9);
		
		JOptionPane.showMessageDialog(null, curso2.exibir());
		
		//e neste caso?
		Object objCurso = new CursoPos(40,"TI", 3000, 6);
		JOptionPane.showMessageDialog(null, ((Curso)objCurso).exibir());
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
		
	}
}
