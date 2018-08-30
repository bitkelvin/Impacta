package br.com.seniorsolution.entidade;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity //só pode ter @Entity se tiver @Id
@Table(name="forum") //quando o nome da tabela é igual, é redundante
public class Forum implements Serializable {

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	//private static final long serialVersionUID = 959852488064428377L;
	private static final long serialVersionUID = 1L;//jvm executa essa linha por default
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)//GEneratedValue só faz sentido pra PK
	@Column(name="IDFORUM")
	private int id;
	
	@Column(name="ASSUNTO", length=45, nullable=false)//45 é o padrão do sql 
	private String assunto;
	
	@Column(name="DESCRICAO", length=45, nullable=false)
	private String descricao;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="forum")
	//FetchType.LAZY: carrega só o que precisa, pra não buscar informação demais
	//mappedBy define a variável que ~liga as duas entidades
	private Set<Usuario> usuarios = new HashSet<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	
	
}
