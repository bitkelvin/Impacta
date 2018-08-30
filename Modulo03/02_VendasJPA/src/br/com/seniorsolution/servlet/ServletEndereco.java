package br.com.seniorsolution.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Cliente;
import br.com.seniorsolution.entidades.Endereco;

@WebServlet("/enderecos")
public class ServletEndereco extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletEndereco() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("cadEnderecos.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			GenericDao<Endereco> dao = new GenericDao<>(Endereco.class);
			GenericDao<Cliente> daoCliente = new GenericDao<>(Cliente.class);
//			EntityManager em = jpaUtil.getEntityManager();//método java numa app web, ruim
			Endereco endereco = new Endereco();
			
			int idCliente = Integer.parseInt(request.getParameter("cliente"));
			Cliente cliente = daoCliente.buscar(idCliente);
			String rua = request.getParameter("rua");
			String cidade = request.getParameter("cidade");
			String cep = request.getParameter("cep");
			
			endereco.setRua(rua);
			endereco.setCidade(cidade);
			endereco.setCep(cep);
			endereco.setCliente(cliente);
			
			//Cliente cliente = em.find(Cliente.class,idCliente);
//			Cliente cliente = daoc.buscar(idCliente);
//			if (cliente != null) {//foi encontrado e tá no estado persistente
//				endereco.setCliente(cliente);
//				cliente.getEnderecos().add(endereco);
//				em.getTransaction().begin();
//				em.persist(cliente);
//				em.getTransaction().commit();
//				
			//dao.adicionarEndereco(idCliente,endereco);
			dao.adicionar(endereco);
//			}
			
			request.setAttribute("mensagem", "Endereço adicionado com sucesso");
			request.getRequestDispatcher("cadEnderecos.jsp").forward(request, response);
			
		} catch (Exception e) {
			
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("cadEnderecos.jsp").forward(request,  response);
		}
	}

}
