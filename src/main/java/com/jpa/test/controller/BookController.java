package com.jpa.test.controller;

import java.util.List;

import com.jpa.test.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;

@RestController
public class BookController {
	
	@Autowired
	private com.jpa.test.services.BookService BookService;
	@GetMapping("/books")
	public List<Book> getBooks() {
		return this.BookService.getAllBooks();
	}
	@GetMapping("/books/{id}")
	public Book getBookById(@PathVariable("id") int id) {
		return this.BookService.getBookById(id);
	}

	@PostMapping("/books")
	public Book addBook(@RequestBody Book book){
		Book b = this.BookService.addBook(book);
		return b;
	}

	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id){
		this.BookService.deleteBook(id);
	}

	@PutMapping("/books/{id}")
	public void updateBook(@RequestBody Book book,  @PathVariable("id") int id){
		this.BookService.updateBook(book , id);
	}
}
