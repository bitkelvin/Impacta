package br.com.seniorsolution.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Pedido;

@WebServlet("/consultas")
public class ServletConsultas extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public ServletConsultas() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("consultas.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String opcao = request.getParameter("opcao");
			String resposta ="";
			int idCliente = Integer.parseInt(request.getParameter("cliente"));
			switch(opcao) {
			case "pedidos":
				List<Pedido> pedidos = new GenericDao<>(Pedido.class).listar();
				for(Pedido p : pedidos) {
					//if(p.getCliente().getId()==idCliente) 
						resposta += p.getPedidoPK() + "<br/>";
				}
				break;
			case "itens":
//				List<Pedido> pedidos = new GenericDao<>(Pedido.class).listar();
//				for(Pedido p : pedidos) {
//					resposta += p.getPedidoPK() + "<br/>";
//				}
			}
			
			request.setAttribute("resposta", resposta);
			request.getRequestDispatcher("consultas.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensagem", e.getMessage());
			request.getRequestDispatcher("consultas.jsp").forward(request, response);
		}
	}

}
