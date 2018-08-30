package br.com.seniorsolution.aplicacao;

import javax.swing.JOptionPane;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.classes.CursoGraduacao;
import br.com.seniorsolution.enumeracoes.TipoObjeto;
import br.com.seniorsolution.utils.Utils;

public class AppUtils {
	public static void main(String[] args) {
		
	try {
		Object obj = Utils.burcarObjeto(TipoObjeto.CURSOGRAD);
		if(obj != null && obj instanceof CursoGraduacao){
			JOptionPane.showMessageDialog(null, ((Curso)obj).exibir());
		}
		
		Aluno aluno = (Aluno)Utils.burcarObjeto(TipoObjeto.ALUNO);
		JOptionPane.showMessageDialog(null, aluno.exibir());
		
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}
}
