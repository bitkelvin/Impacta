package br.com.seniorsolution.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.dao.GenericDao;
import br.com.seniorsolution.entidades.Cliente;
import br.com.seniorsolution.entidades.Pedido;
import br.com.seniorsolution.entidades.PedidoPK;

@WebServlet("/pedidos")
public class ServletPedidos extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public ServletPedidos() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("cadPedidos.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//tá indo duas vezes ao banco de  dados - fazendo uma classe própria seria uma só
			GenericDao<Pedido> daoPedido = new GenericDao<>(Pedido.class);
			GenericDao<Cliente> daoCliente = new GenericDao<>(Cliente.class);
			
			int idCliente = Integer.parseInt(request.getParameter("cliente"));
			Cliente cliente = daoCliente.buscar(idCliente);
			
			int numPedido = Integer.parseInt(request.getParameter("numpedido"));
			String categoria = request.getParameter("categoria");
			//DateFormat lança exceção verificada (try/catch)
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			String datastr = request.getParameter("data");
			Date data = new Date(format.parse(datastr).getTime());
			
			Pedido pedido = new Pedido();
			PedidoPK pk = new PedidoPK();
			pk.setCategoria(categoria);
			pk.setCodigo(numPedido);
			pedido.setPedidoPK(pk);
			pedido.setDataPedido(data);
			pedido.setCliente(cliente);
			
			daoPedido.adicionar(pedido);
			
			request.setAttribute("mensagem", "Pedido efetuado");
			request.getRequestDispatcher("cadPedidos.jsp").forward(request, response);
			
			
		} catch (Exception e) {
			request.setAttribute("mensagem", "ERRO: " + e.getMessage());
			request.getRequestDispatcher("cadPedidos.jsp").forward(request, response);
		}

	}

}
