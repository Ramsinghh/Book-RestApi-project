package com.jpa.test.entities;

public class Book {
	
	private int bookId;
	private String name;
	private String authorName;
	
	public Book(int bookId, String name, String authorName) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.authorName = authorName;
	}

	public Book() {
		
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
}
