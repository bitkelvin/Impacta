package br.com.seniorsolution.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpaUtil {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaVendas");
	
	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}
}
