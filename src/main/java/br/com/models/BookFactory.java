package br.com.models;

import java.util.ArrayList;
import java.util.List;

public class BookFactory {

	ArrayList<Book> books;

	public BookFactory() {
		if (books == null || books.equals("null")) {
			this.books = new ArrayList<Book>();
		}
	}

	public void register(Book book) {

		books.add(book);
	}

	public List<Book> listBook() {
		List<Book> name = new ArrayList<Book>();
		try {

			for (Book book : books) {
				name.add(book);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return name;
	}

	
	
	

}
