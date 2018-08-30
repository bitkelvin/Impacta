package br.com.seniorsolution.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable //conjunto de chaves de uma tabela
public class PedidoPK implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name="NUMPEDIDO")
	private int codigo;
	
	@Column(name="CATEGORIA")
	private String categoria;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof PedidoPK) {
			PedidoPK pk = (PedidoPK)o;
			if(this.getCodigo()==pk.getCodigo() && this.getCategoria()==pk.getCategoria())
				return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return this.getCategoria().hashCode()+this.getCodigo();
	}
	
	@Override
	public String toString() {
		return this.getCodigo()+ " " + this.getCategoria();
	}
}
