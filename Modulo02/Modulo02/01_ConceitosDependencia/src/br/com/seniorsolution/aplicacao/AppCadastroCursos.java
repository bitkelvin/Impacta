package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.dao.AlunosDao;

public class AppCadastroCursos {
	
	public static void main(String[] args) {
		
		while(true){
			int opcao = JOptionPane.showConfirmDialog(
					null, 
					"Deseja incluir um novo curso?",
					"Cadastro Cursos",
					JOptionPane.YES_NO_OPTION);
		
			if(opcao == JOptionPane.NO_OPTION){
				break;
			}
			
			try {
				AlunosDao dao = new AlunosDao();
				
				Aluno aluno = (Aluno)JOptionPane.showInputDialog(
						null,
						"Selecione o aluno",
						"Alunos",
						JOptionPane.QUESTION_MESSAGE,
						null,
						dao.listarAlunos().toArray(),
						null);				
				
				int codigo = Integer.parseInt(
					JOptionPane.showInputDialog("Código do curso"));
				
				String descricao = 
					JOptionPane.showInputDialog("Descrição do curso");
				
				int ch = Integer.parseInt(
					JOptionPane.showInputDialog("Carga horária"));
				
				Curso curso = new Curso(codigo,descricao,ch);

				dao.incluirCurso(curso, aluno);
				
				JOptionPane.showMessageDialog(
						null, "Curso incluído com sucesso");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(
						null, 
						e.getMessage(), 
						"Erro", 
						JOptionPane.ERROR_MESSAGE);
			}
			
		}
	}
}
