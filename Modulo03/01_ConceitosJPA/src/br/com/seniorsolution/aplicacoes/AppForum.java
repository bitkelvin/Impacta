package br.com.seniorsolution.aplicacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.seniorsolution.entidade.Forum;
import br.com.seniorsolution.entidade.Usuario;
import br.com.seniorsolution.helper.ForumHelper;

public class AppForum {

	
	
	
	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaForum");
		
		EntityManager em = emf.createEntityManager();

		//EntityManager em = Persistence.createEntityManagerFactory("jpaForum").createEntityManager();
		
		try {
			
			Forum forum = new Forum(); //ESTADO: DETTACHED (não sabe nada a respeito do banco de dados
			ForumHelper dao = new ForumHelper(em);
			
//			forum.setAssunto("Projeto JPA");
//			forum.setDescricao("Exemplo de JPA com maven");
			
			forum.setAssunto("Problemas com JPA");
			forum.setDescricao("Busca de ajuda na solução de problemas");
			
			Usuario us1 = new Usuario();
			us1.setNome("Gerson");
			us1.setEmail("gerson@impacta.com.br");
			us1.setForum(forum);
			
			Usuario us2 = new Usuario();
			us2.setNome("Ana Maria");
			us2.setEmail("anamaria@seniorsolution.com.br");
			us2.setForum(forum);
			
			forum.getUsuarios().add(us1);
			forum.getUsuarios().add(us2);
			
			dao.salvar(forum);
			
			System.out.println("ok, incluído");
			JOptionPane.showMessageDialog(null,"Forum incluído");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
