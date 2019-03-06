package com.example.library.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import com.alibaba.fastjson.JSONObject;

@Entity
public class Book {

	@Id
	@GeneratedValue(generator = "system_uuid")
	@GenericGenerator(name = "system_uuid", strategy = "uuid")
	private String ids;
	@Column(length=35)
	private String book_no;
	@Column(length=35)
	private String author;
	@Column(length=100,name="book_name")
	private String bookName;
	@Column(length=20)
	private String class_number;
	@Column(length=200)
	private String publishing_house;
	@Column(length=200,columnDefinition="date")
	private String published_date;
	@Column
	private double price;
	
	public Book() {
		super();
	}
	public Book(String json) {
		super();
		JSONObject jObject=JSONObject.parseObject(json);
		this.ids=jObject.getString("ids");
		this.book_no=jObject.getString("book_no");
		this.bookName=jObject.getString("bookName");
		this.author=jObject.getString("author");
		this.class_number=jObject.getString("class_number");
		this.publishing_house=jObject.getString("publishing_house");
		this.published_date=jObject.getString("published_date");
		this.price=jObject.getDoubleValue("price");
	}
	
	public Book(String ids, String book_no,String author, String bookName, String class_number, String publishing_house,
			String published_date, double price) {
		super();
		this.ids = ids;
		this.book_no = book_no;
		this.author = author;
		this.bookName = bookName;
		this.class_number = class_number;
		this.publishing_house = publishing_house;
		this.published_date = published_date;
		this.price = price;
	}
	public String getIds() {
		return ids;
	}
	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getBook_no() {
		return book_no;
	}
	public void setBook_no(String book_no) {
		this.book_no = book_no;
	}
	public String getbookName() {
		return bookName;
	}
	public void setbookName(String bookName) {
		this.bookName = bookName;
	}
	public String getClass_number() {
		return class_number;
	}
	public void setClass_number(String class_number) {
		this.class_number = class_number;
	}
	public String getPublishing_house() {
		return publishing_house;
	}
	public void setPublishing_house(String publishing_house) {
		this.publishing_house = publishing_house;
	}
	public String getPublished_date() {
		return published_date;
	}
	public void setPublished_date(String published_date) {
		this.published_date = published_date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
