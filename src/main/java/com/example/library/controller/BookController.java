package com.example.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
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
	public Page<Book> findAll(@RequestBody String json) {
		return bookService.findAll(json);
	}

	@RequestMapping("/findBook")
	public Page<Book> findBook(@RequestBody String json) {
		return bookService.findBook(json);
	}

	@RequestMapping("/addBook")
	public void addBook(@RequestBody String json) {
		bookService.addBook(json);
	}

	@RequestMapping("/delBook/{book_id}")
	public void delBook(@PathVariable("book_id")String book_id) {
		bookService.delBook(book_id);
	}

}
