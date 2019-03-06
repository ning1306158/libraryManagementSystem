package com.example.library.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.example.library.domain.Book;
import com.example.library.domain.BookRepository;
import com.example.library.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	BookRepository bookRepository;
	static SimpleDateFormat  format=new SimpleDateFormat("yyyyMMddhhmmss");

	@Override
	public Page<Book> findAll(String json) {
		JSONObject jsonObject=JSONObject.parseObject(json);
		int page_num=jsonObject.getIntValue("page_num");
		int page_size=jsonObject.getIntValue("page_size");
		Pageable pageable=PageRequest.of(page_num-1, page_size);
		return bookRepository.findAll(pageable);
	}
	@Override
	public Page<Book> findBook(String json) {
		JSONObject jsonObject=JSONObject.parseObject(json);
		int page_num=jsonObject.getIntValue("page_num");
		String key=jsonObject.getString("key");
		int page_size=jsonObject.getIntValue("page_size");
		Pageable pageable=PageRequest.of(page_num-1, page_size);
		return bookRepository.findByBookNameContainingOrAuthorContaining(key, key, pageable);
	}

	@Override
	public void addBook(String json) {
		Book book=new Book(json);
		book.setBook_no("B"+format.format(new Date())+System.currentTimeMillis()+(int)(Math.random()*100));
		bookRepository.save(book);
	}

	@Override
	public void delBook(String book_id) {
		bookRepository.deleteById(book_id);
	}

}
