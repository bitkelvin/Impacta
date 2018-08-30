package br.com.seniorsolution.helper;

import javax.persistence.EntityManager;

import br.com.seniorsolution.entidade.Forum;
import br.com.seniorsolution.entidade.Usuario;

public class ForumHelper {

	private EntityManager em; //obrigatório
	
	public ForumHelper(EntityManager em) {
		this.em = em;
	}
	
	//insere uma linha no banco
	public void salvar(Forum forum) throws Exception{
		em.getTransaction().begin();
		em.persist(forum);//ESTADO: ATTACHED (agora conectado ao jpa)
		em.getTransaction().commit();
	}
	
	public void adicionarUsuario(int idForum, Usuario usuario) throws Exception{
		Forum f = em.find(Forum.class, idForum);//o segundo é Object, mas passa a PK
		//ESTADO: PERSISTENT
		if (f != null) {//foi encontrado e tá no estado persistente
			usuario.setForum(f);
			f.getUsuarios().add(usuario);
			em.getTransaction().begin();
			em.persist(f);
			em.getTransaction().commit();
		}
	}
	
}
