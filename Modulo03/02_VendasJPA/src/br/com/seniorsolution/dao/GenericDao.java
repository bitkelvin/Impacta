package br.com.seniorsolution.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.seniorsolution.utils.jpaUtil;

public class GenericDao<T extends Serializable> implements Dao<T>{

	private final Class<T> classe;
	protected EntityManager em;
	
	
	public GenericDao(Class<T> classe) {
		this.classe=classe;
	}
	
	@Override
	public void adicionar(T entidade) {
		em = jpaUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(entidade);
		em.getTransaction().commit();
		em.close();
	}
	
//	public void adicionarEndereco(int idCliente, Endereco endereco) {
//		em = jpaUtil.getEntityManager();
//		
//		Cliente cliente = em.find(Cliente.class,idCliente);
//		
//		if(cliente!=null) {
//			endereco.setCliente(cliente);
//			cliente.getEnderecos().add(endereco);
//			em.getTransaction().begin();
//			em.persist(cliente);
//			em.getTransaction().commit();
//		}
//		em.close();
//	}
	
	//jpql- java persistence query language
	@Override
	public List<T> listar() {
		em = jpaUtil.getEntityManager();
		TypedQuery<T> query = em.createQuery("From " + classe.getSimpleName(), classe);//NOME DA ENTIDADE NÃO DA TABELA
		List<T> lista = query.getResultList();
		
		em.close();
		return lista;
	}

	@Override
	public T buscar(Object id) {
		em = jpaUtil.getEntityManager();
		em.getTransaction().begin();
		T entidade = em.find(classe, id);
		em.getTransaction().commit();
		em.close();
		return entidade;
	}
	
}
