package br.com.seniorsolution.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Item;
import br.com.seniorsolution.entidades.Pedido;
import br.com.seniorsolution.entidades.PedidoPK;

@WebServlet("/itens")
public class ServletItens extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ServletItens() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("cadItens.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			GenericDao<Pedido> daoPedido = new GenericDao<>(Pedido.class);
			GenericDao<Item> daoItem = new GenericDao<>(Item.class);
			
			PedidoPK pk = new PedidoPK();
			pk.setCategoria(request.getParameter("pedido").split(" ")[1]);
			pk.setCodigo(Integer.parseInt(request.getParameter("pedido").split(" ")[0]));
			Pedido pedido = daoPedido.buscar(pk);
			
			Item item = new Item();
			item.setDescricao(request.getParameter("desc"));
			item.setQuantidade(Double.parseDouble(request.getParameter("qtde")));
			item.setPedido(pedido);
			
			daoItem.adicionar(item);
			
			request.setAttribute("mensagem", "Item incluído com sucesso");
			request.getRequestDispatcher("cadItens.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("cadItens.jsp").forward(request, response);
		}

	}

}
