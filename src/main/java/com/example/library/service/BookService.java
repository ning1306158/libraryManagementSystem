package com.example.library.service;

import java.util.List;

import com.example.library.domain.Book;

public interface BookService {
	
	List<Book> findAll();

	List<Book> findBook(String json);

	void addBook(String json);

	void delBook(String json);

}
