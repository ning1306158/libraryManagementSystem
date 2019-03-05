package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.domain.Book;
import com.example.library.service.BookService;

@RestController
@RequestMapping("/Book")
public class BookController {
	@Autowired
	BookService bookService;

	@RequestMapping()
	public List<Book> findAll() {
		return bookService.findAll();
	}

	@RequestMapping("/findBook")
	public List<Book> findBook(@RequestBody String json) {
		return bookService.findBook(json);
	}

	@RequestMapping("/addBook")
	public void addBook(@RequestBody String json) {
		bookService.addBook(json);
	}

	@RequestMapping("/delBook")
	public void delBook(@RequestBody String json) {
		bookService.delBook(json);
	}

}
