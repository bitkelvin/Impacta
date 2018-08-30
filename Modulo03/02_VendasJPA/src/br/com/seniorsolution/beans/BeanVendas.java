package br.com.seniorsolution.beans;

import java.util.List;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Cliente;
import br.com.seniorsolution.entidades.Pedido;

public class BeanVendas {

	
	//conceito de getter/setter: propriedade listaClientes
	public List<Cliente> getListaClientes(){
		GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
		return dao.listar();
	}
	
	public List<Pedido> getListaPedidos(){
		GenericDao<Pedido> dao = new GenericDao<>(Pedido.class);
		return dao.listar();
	}
	
}
