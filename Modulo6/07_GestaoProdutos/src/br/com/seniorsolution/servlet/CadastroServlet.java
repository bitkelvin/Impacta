package br.com.seniorsolution.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entity.Produto;

/**
 * Servlet implementation class ProdutoServlet
 */
@WebServlet("/produtos")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("cadastro.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		try {
			int codigo = Integer.parseInt(request.getParameter("codigo"));
			String descricao = request.getParameter("descricao");
			double preco = Double.parseDouble(request.getParameter("preco"));
			String fabricante = request.getParameter("fabricante");
			
			Produto produto = new Produto();
			produto.setCodigo(codigo);
			produto.setDescricao(descricao);
			produto.setPreco(preco);
			produto.setFabricante(fabricante);
			
			GenericDao<Produto> dao = new GenericDao<>(Produto.class);
			dao.adicionar(produto);
			
			//adicionando um atributo à requisição
			request.setAttribute("mensagem", "Produto adicionado com sucesso");
			request.getRequestDispatcher("cadastro.jsp").forward(request, response);
			
			
			//out.print("<h2>Cliente adicionado com sucesso!</h2>");
			
			
		} catch (Exception e) {
			//out.print("ERRO: " + e.getMessage());
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("produto.jsp").forward(request, response);
			
			//e.printStackTrace();
		}
		}

}
