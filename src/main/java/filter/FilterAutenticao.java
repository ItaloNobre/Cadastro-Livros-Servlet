package filter;


import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = {"/templates/*"})/*Interceptas todas as requisiçoes que vierem do projeto ou mapeamento*/
public class FilterAutenticao implements Filter {

    public FilterAutenticao() {
    }

	public void destroy() {
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	     
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		
		String usuarioLogado = (String) session.getAttribute("usuario");
		
		String urlParaAutenticar = req.getServletPath();
		
		
		if (usuarioLogado == null  && 
				!urlParaAutenticar.equalsIgnoreCase("/templates/ServletLogin")) {
			
			RequestDispatcher redireciona = request.getRequestDispatcher("/index.jsp?url=" + urlParaAutenticar);
			request.setAttribute("msg", "Por favor realize o login!");
			redireciona.forward(request, response);
			return; 
			
		}else {
			chain.doFilter(request, response);
		}
		
	
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}