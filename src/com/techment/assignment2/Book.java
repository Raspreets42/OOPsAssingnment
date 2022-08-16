package com.techment.assignment2;

public class Book extends EngineeringBook {
	private int bookNo;
	private String title , author ;
	private float price;
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public int getBookNo() {
		return bookNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public float getPrice() {
		return price;
	}
	
	
}