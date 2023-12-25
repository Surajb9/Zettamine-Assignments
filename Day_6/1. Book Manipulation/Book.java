package com.zettamine.bookManipulation;

public class Book {

	 private long isbnNo;
	 private String bookTitle;
	 private String bookAuthor;
	 public long getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(long isbnNo) {
		this.isbnNo = isbnNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Book(long isbnNo, String bookTitle, String bookAuthor) {
		super();
		this.isbnNo = isbnNo;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
	}
	

}
