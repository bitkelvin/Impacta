package br.com.seniorsolution.entidades;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class Disciplina {
	
	private int id;
	
	@NotNull
	@NotEmpty(message="{erro.disciplina.descricao.vazio}")
	@Size(min=5,max=45,message="{erro.disciplina.descricao}")
	private String descricao;
	
	@Range(min=20, max=3600, message="{erro.disciplina.range}")
	private int ch;
	
	private Curso curso;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
	
}
