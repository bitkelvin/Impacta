package br.com.seniorsolution.filtros;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.seniorsolution.entidades.Usuario;

@WebFilter(urlPatterns= {"/escola/*"})
public class LoginFilter implements Filter {

    public LoginFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		Usuario usuario = (Usuario)req.getSession().getAttribute("user");
		
 		if(usuario != null) {
			if(usuario.getNivel() == 1) {
				chain.doFilter(request, response);
			}
		}
		
		resp.sendRedirect("http://localhost:8080/01_SpringWeb/");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
