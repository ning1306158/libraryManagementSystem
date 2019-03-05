package com.example.library.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Book {

	@Id
	@GeneratedValue(generator = "system_uuid")
	@GenericGenerator(name = "system_uuid", strategy = "uuid")
	private String ids;
	@Column(length=35)
	private String book_no;
	@Column(length=100)
	private String book_name;
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
	
	public Book(String ids, String book_no, String book_name, String class_number, String publishing_house,
			String published_date, double price) {
		super();
		this.ids = ids;
		this.book_no = book_no;
		this.book_name = book_name;
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
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
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
}