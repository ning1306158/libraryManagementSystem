package com.example.library.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.example.library.domain.Book;
import com.example.library.domain.BookRepository;
import com.example.library.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public List<Book> findBook(String json) {
		JSONObject jsonObject=JSONObject.parseObject(json);
//		bookRepository.findBook()
		return null;
	}

	@Override
	public void addBook(String json) {
		Book book=new Book(json);
		bookRepository.save(book);
	}

	@Override
	public void delBook(String json) {
	}

}
