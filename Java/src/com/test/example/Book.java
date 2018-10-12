package com.test.example;

public class Book {

	//Book.java
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubDate = "2018";
	private String isbn;
	private int page = 500;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		
		//유효성 검사
		if (title.length() <= 0 || title.length() > 50) {
			
			System.out.println("올바른 제목이 아닙니다.");
			return;
		}
		
		for (int i=0; i<title.length(); i++) {
			
			char c = title.charAt(i);
			
			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '가' || c > '힣') && (c < '0' || c > '9') && c != ' ') {
				System.out.println("올바른 제목이 아닙니다.");
				return;
			}
			
		}
		
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		
		//유효성 검사
		if (price < 0 || price > 100000) {
			System.out.println("올바른 가격이 아닙니다.");
			return;
		}
		this.price = price;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPubDate() {
		return pubDate;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getPage() {
		return page;
	}
	
	public String info() {

		return this.title + ", " + this.price + ", " + this.author + ", " + this.publisher + ", " + this.pubDate + ", " + this.isbn + ", " + this.page;
	}
	
		
	
}
