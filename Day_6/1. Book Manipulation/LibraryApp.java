package com.zettamine.bookManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		Library lib = new Library();
		while(choice!=5) {
		System.out.println("1. Add Book");
		System.out.println("2. Display all book details");
		System.out.println("3. Search Book by author ");
		System.out.println("4. Count number of books - by book name");
		System.out.println("5. Exit");
		
		System.out.print("Enter your choice :");
		choice = scan.nextInt();
		switch(choice) {
		
		case 1 : System.out.print("Enter the isbn no: ");
		         long isbn = scan.nextLong();
		         System.out.print("Enter the book name: ");
		         scan.nextLine();
		         String name = scan.nextLine();
		         System.out.print("Enter the author name: ");
		         String author = scan.nextLine();
		         Book b = new Book(isbn,name,author);
		         lib.addBook(b);
		         System.out.println();
		         System.out.println("Book Added Succesfully");
		         System.out.println();
		         break;
		         
		         
		case 2 : System.out.println();
		         List<Book> books = lib.viewAllBooks();
		         for(Book b1 : books) {
		        	 System.out.println("ISBN No: " + b1.getIsbnNo() +
                                        " |Book name: " + b1.getBookTitle() +
                                        " |Author name: " + b1.getBookAuthor());
                 }
		         
                 break;
                 
		case 3 : System.out.print("Enter the author name: ");
		         scan.nextLine();
		         String authName = scan.nextLine();
		         ArrayList<Book> authorBooks = lib.viewBooksByAuthor(authName);
		         if (authorBooks.isEmpty()) {
                 } else {
                     for (Book book : authorBooks){
                         System.out.println("ISBN no: " + book.getIsbnNo() +
                                            "| Book name: " + book.getBookTitle() +
                                            "| Author name: " + book.getBookAuthor());
                     }
                 }
                 break;
                 
		case 4 : System.out.print("Enter the book name: ");
		         scan.nextLine();
		         String bookName = scan.nextLine();
		         int bookCount = lib.countNoOfBook(bookName);
		         System.out.println("Number of books with the given name  is " + bookName + " : " + bookCount);
                 break;
                 
		case 5 : System.out.println("Exiting program");
		         System.exit(0);
                 break;
             
        default :
        	     System.err.println("Invalid input");
		}
     
	}
		scan.close();

}
}
