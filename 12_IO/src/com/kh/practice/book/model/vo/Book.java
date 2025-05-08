package com.kh.practice.book.model.vo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book {
	private String title;
	private String author;
	private int price;
	private Calendar date;
	private double discount;
	
	
	public Book() {}

	public Book(String title, String author, int price, Calendar date, double discount) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.date = date;
		this.discount = discount;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", date=" + date + ", discount="
				+ discount + "]";
	}
	//필드의 값을 반환. 단, date필드는 SimpleDateFormat을 통해“yyyy년 MM월 dd일”로 반환되게 함

	

}
