package br.com.seniorsolution.entidades;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Escola {
	
	private int id;
	
	@NotNull 
	@NotEmpty(message="{erro.escola.descricao.vazio}") 
	@Size(min=4, max=45, message="{erro.escola.descricao}")
	private String descricao;

	@NotNull 
	@NotEmpty(message="{erro.escola.endereco.vazio}") 
	@Size(min=10, max=60, message="{erro.escola.endereco}")	
	private String endereco;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dataFundacao;
	
	private List<Curso> cursos = new ArrayList<>();
	
	//propriedade de conveniencia
	public void setDataString(String data) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.setDataFundacao(df.parse(data));
		} catch (Exception e) {
			this.setDataFundacao(new Date());
		}
	}

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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
}
