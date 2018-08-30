package br.com.seniorsolution.dao;

import java.util.List;

public interface Dao<T> {
	void adicionar(T entidade);
	List<T> listar();
	T buscar(Object id);
}
