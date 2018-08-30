package br.com.seniorsolution.entidades;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Curso {
	
	private int id;
	
	@NotNull
	@NotEmpty(message="{erro.escola.descricao.vazio}")
	@Size(min=5,max=45,message="{erro.curso.descricao}")
	private String descricao;
	
	private Escola escola;
	
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
	public Escola getEscola() {
		return escola;
	}
	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	
	
}
