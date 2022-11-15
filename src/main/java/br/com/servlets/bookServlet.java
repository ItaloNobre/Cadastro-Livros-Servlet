package br.com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.models.Book;
import br.com.models.BookFactory;

@WebServlet("/bookServlet")
public class bookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookFactory books;

	public bookServlet() {
		super();
		books = new BookFactory();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Book> list = books.listBook();

		request.setAttribute("list", list);

		RequestDispatcher dispatcher = request.getRequestDispatcher("templates/StoreBooks.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		String author = request.getParameter("author");
		Book book = new Book();
		int id = books.listBook().size();
		book.setTitle(name);
		book.setAuthor(author);
		book.setId(id);
		books.register(book);

		doGet(request, response);

	}

}
