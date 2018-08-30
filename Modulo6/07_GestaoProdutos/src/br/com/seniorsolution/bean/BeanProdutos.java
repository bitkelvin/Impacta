package br.com.seniorsolution.bean;

import java.util.List;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Produto;

public class BeanProdutos {
	public List<Produto> getListaProdutos(){
		GenericDao<Produto> dao = new GenericDao<>(Produto.class);		
		return dao.listar();
	}
}
