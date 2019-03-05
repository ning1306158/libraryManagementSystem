package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.domain.Book;
import com.example.library.service.BookService;

@RestController
@RequestMapping("/index")
public class BookController {
	@Autowired
	BookService bookService;
	@RequestMapping
	public  List<Book> index() {
		return bookService.findAll();
	}

}
