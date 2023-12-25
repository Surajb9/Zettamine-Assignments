package com.zettamine.bookManipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Library {
	
	 private List<Book> bookList = new  ArrayList<Book>();

	public Library() {
		super();
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBook(Book bobj) {
		
		bookList.add(bobj);
	} 
	
	
	 public boolean isEmpty() {
		 if(!bookList.isEmpty()) {
			 return false;
		 }
		 else {
			 return true;
		 }
		 
	 }
	 
	 public List<Book> viewAllBooks(){
		 return bookList;
	 } 
	 
	 public ArrayList<Book> viewBooksByAuthor(String author){
		 ArrayList<Book> bookAuthor = new  ArrayList<Book>();
		 Iterator<Book> it = bookList.iterator();
		 while(it.hasNext()) {
			 Book b = it.next();
			 if(b.getBookAuthor().equalsIgnoreCase(author)){
				 bookAuthor.add(b);
			 }
			
		 }
		 if (bookAuthor.isEmpty()) {
	            System.out.println("None of the book published by the author " + author);
	        }
		 return bookAuthor;
		
	 }
	 
	 public int countNoOfBook(String bname) {
		 int count = 0;
		 Iterator<Book> it = bookList.iterator();
		 while(it.hasNext()) {
			 Book b = it.next();
			 if(b.getBookTitle().equalsIgnoreCase(bname)){
				 count++;
			 }
			
		 }
		 return count;
	 }

}
