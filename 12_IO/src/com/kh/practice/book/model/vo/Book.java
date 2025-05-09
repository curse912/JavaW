package com.kh.practice.book.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Book implements Serializable{	//직렬화 객체를 byte로 변환
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
		//날짜가 감이 안잡혀유
		Date d = new Date(date.getTimeInMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 mm월 dd일");
		return  title + ": \t" + author + "\t" + price + "\t " + sdf.format(d) + "  \t "
				+ discount ;
		//sdf.format(date.getTime())
	}
	//필드의 값을 반환. 단, date필드는 SimpleDateFormat을 통해“yyyy년 MM월 dd일”로 반환되게 함

	

}
