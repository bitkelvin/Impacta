package br.com.seniorsolution.entidades;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="pedido")
public class Pedido implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PedidoPK pedidoPK;
	
	@Temporal(value=TemporalType.TIMESTAMP)
	@Column(name="DATAPEDIDO")
	private Date dataPedido;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="IDCLIENTE")
	private Cliente cliente;
	
	//o que tá no mappedBy é a propriedade e não a variável pedido 
	//(o que vale é o getter e o setter)
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="pedido")
	private Set<Item> items = new LinkedHashSet<>();

	public PedidoPK getPedidoPK() {
		return pedidoPK;
	}

	public void setPedidoPK(PedidoPK pedidoPK) {
		this.pedidoPK = pedidoPK;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
}
