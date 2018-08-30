package br.com.seniorsolution.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@ManagedBean(name="beanLivro")
@Table(name="livro")
public class Livro implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="CODIGO")
	private int codigo;
	
	@Column(name="TITULO")
	private String titulo;
	
	@Column(name="AUTOR")
	private String autor;
	
	@Column(name="DATAPUB")
	private Date dataPublicacao;
	
	@Column(name="PRECO")
	private double preco;
	
	@Lob
	@Column(name="IMAGEM")
	private byte[] imagem;

	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY,mappedBy="livro")
	private Set<Revisao> revisoes;
	
	
	/*
	 * TINYBLOB => 255 bytes
	 * BLOB => 64 kb
	 * MEDIUMBLOB => 16 mb
	 * LONGBLOB => 4 Gb
	 */
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public Set<Revisao> getRevisoes() {
		return revisoes;
	}

	public void setRevisoes(Set<Revisao> revisoes) {
		this.revisoes = revisoes;
	}
	
	
	
	
	
	
	
	
	
	

}
