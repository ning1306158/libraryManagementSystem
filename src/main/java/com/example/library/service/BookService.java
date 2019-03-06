package com.example.library.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.library.domain.Book;

public interface BookService {
	
	Page<Book> findAll(String json);

	Page<Book> findBook(String json);

	void addBook(String json);

	void delBook(String book_id);

}
