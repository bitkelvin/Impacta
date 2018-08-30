package br.com.seniorsolution.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Cliente;


@WebServlet("/clientes")
public class ServletClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletClientes() {
        super();
    }

	//sem nada nesse método a página (chamada por url) aparece em branco
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//executa uma chamada get
		response.sendRedirect("cadClientes.jsp");
	}

	//HttpServletRequest info que entra
	//HttpServletResponse info que sai
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//equivalente ao System.out.println (para o browser) (não recomendado)
		//PrintWriter out = response.getWriter();
		//especifica o formato de saída (o <h2> funciona como html por causa disso)
		response.setContentType("text/html");
		
		try {
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			String empresa = request.getParameter("empresa");
			
			Cliente cliente = new Cliente();
			cliente.setId(codigo);
			cliente.setEmpresa(empresa);
			
			GenericDao<Cliente> dao = new GenericDao<>(Cliente.class);
			dao.adicionar(cliente);
			
			//adicionando um atributo à requisição
			request.setAttribute("mensagem", "Cliente adicionado com sucesso");
			request.getRequestDispatcher("cadClientes.jsp").forward(request, response);
			
			//out.print("<h2>Cliente adicionado com sucesso!</h2>");
			//não é uma boa prática fazer com que o servlet exiba mensagens ao usuário
			
		} catch (Exception e) {
			//out.print("ERRO:" + e.getMessage());
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("cadClientes.jsp").forward(request,  response);
			//e.printStackTrace();
		}
	}

}
