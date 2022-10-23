package com.jpa.test.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.jpa.test.entities.Book;
import org.springframework.stereotype.Component;

@Component
public class BookService {

	private static List<Book> list = new ArrayList<>();
	static {
		list.add(new Book(10 , "Complete Java Reference" , "RamSingh"));
		list.add(new Book(11 , "Complete Python Reference" , "xyz"));
		list.add(new Book(12 , "Complete C++ Reference" , "abc"));
	}
	
	public List<Book> getAllBooks(){
		return list;
	}

	public Book getBookById(int id) {
		Book book = null;
		book = list.stream().filter(e-> e.getBookId()==id).findFirst().get();
		return book;
	}
	public Book addBook(Book b){
		list.add(b);
		return b;
	}
	public void deleteBook(int id){
		list = list.stream().filter((a)->a.getBookId()!=id).collect(Collectors.toList());
	}

	public void updateBook(Book book , int id) {
		list = list.stream().map(e->{
			if(e.getBookId()==id){
				e.setAuthorName(book.getAuthorName());
				e.setName(book.getName());
			}
			return e;
		}).collect(Collectors.toList());
	}
}
