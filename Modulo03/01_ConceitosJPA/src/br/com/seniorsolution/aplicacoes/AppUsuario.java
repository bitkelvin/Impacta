package br.com.seniorsolution.aplicacoes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import br.com.seniorsolution.entidade.Usuario;
import br.com.seniorsolution.helper.ForumHelper;

public class AppUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaForum");
		
		EntityManager em = emf.createEntityManager();
		
		
		//criaremos um usuario e o adicionaremos a um forum existente
		try {
			Usuario usuario = new Usuario();
			usuario.setNome("Joaquim");
			usuario.setEmail("Joaquim@email.com.br");
			
			ForumHelper dao = new ForumHelper(em);
			dao.adicionarUsuario(1, usuario);
			
			System.out.println("ok");
			JOptionPane.showMessageDialog(null, "Usuário adicionado");
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
	}

}
