package br.com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.models.ModelLogin;


@WebServlet(urlPatterns = {"/templates/ServletLogin", "/ServletLogin"})
public class ServletLogin extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

  
    public ServletLogin() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String url = request.getParameter("url");
		
		
		if (login != null && !login.isEmpty() && password != null && !password.isEmpty()) {
			
			ModelLogin modelLogin = new ModelLogin();
			modelLogin.setLogin(login);
			modelLogin.setPassword(password);
			
			if (modelLogin.getLogin().equalsIgnoreCase("admin")
					&& modelLogin.getPassword().equalsIgnoreCase("admin")) {
				
				request.getSession().setAttribute("usuario", modelLogin.getLogin());
				
				if (url == null || url.equals("null")) {
					url = "/templates/Home.jsp";
				}
				
				RequestDispatcher redirecionar = request.getRequestDispatcher(url);
				redirecionar.forward(request, response);
				
			}else {
				RequestDispatcher redirecionar = request.getRequestDispatcher("/index.jsp");
				request.setAttribute("msg", "Informe o login e senha corretamente!");
				redirecionar.forward(request, response);
			}
			
		}else {
			RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "Informe o login e senha corretamente!");
			redirecionar.forward(request, response);
		}
		
	}

}