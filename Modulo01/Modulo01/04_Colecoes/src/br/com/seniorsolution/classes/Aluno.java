package br.com.seniorsolution.classes;

import java.util.Set;

import br.com.seniorsolution.enumeracoes.Sexo;

public class Aluno extends Pessoa{
	private int matricula;
	private Curso curso;
	private Set<Curso> outrosCursos;
	
	public Set<Curso> getOutrosCursos() {
		return outrosCursos;
	}

	public void setOutrosCursos(Set<Curso> outrosCursos) {
		this.outrosCursos = outrosCursos;
	}

	public Aluno(String nome, int idade, Sexo sexo, int matricula, Curso curso) {
		super(nome, idade, sexo);
		// TODO Auto-generated constructor stub
		this.setMatricula(matricula);
		this.setCurso(curso);
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String exibir(){

		
		String resultado = super.exibir() + 
				"\nMatricula: " + this.getMatricula() +
				"\nCurso: " + this.getCurso().exibir();
		
		if(this.getOutrosCursos() != null){
			resultado += "\nCursos Anteriores: ";
			for (Curso item : this.getOutrosCursos()) {
				resultado += "\n " + item;
			}
		}
		
		return resultado;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String resposta = super.toString();
		if(this.getCurso() != null){
			resposta += "- curso: " + this.getCurso().getDescricao();
		}
		return resposta;
	}
	
	
	
}
