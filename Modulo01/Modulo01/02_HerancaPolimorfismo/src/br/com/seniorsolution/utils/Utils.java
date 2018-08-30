package br.com.seniorsolution.utils;

import br.com.seniorsolution.classes.Aluno;
import br.com.seniorsolution.classes.Curso;
import br.com.seniorsolution.classes.CursoGraduacao;
import br.com.seniorsolution.classes.CursoPos;
import br.com.seniorsolution.classes.Funcionario;
import br.com.seniorsolution.classes.Pessoa;
import br.com.seniorsolution.enumeracoes.Sexo;
import br.com.seniorsolution.enumeracoes.TipoObjeto;

public class Utils {
	public static Object burcarObjeto(TipoObjeto tipo) throws Exception{
		
		Object objeto;
		
		switch(tipo){
		case PESSOA: 
			objeto = new Pessoa("Dan", 21, Sexo.MASCULINO);
			break;
		case FUNCIONARIO: 
			objeto = new Funcionario("Dan", 21, Sexo.MASCULINO, "48192604802", "Desenvolvedor", 4000);
			break;
		case ALUNO: 
			objeto = new Aluno("Dan", 21, Sexo.MASCULINO, 120, new Curso(10,"Java",100));
			break;
		case CURSOGRAD: 
			objeto = new CursoGraduacao(100, "PMI", 600, 4);
			break;
		case CURSOPOS: 
			objeto = new CursoPos(200, "Cloud", 360, 22);
			break;
		default:
			objeto = null;
		}
		
		return objeto;
	}
}
