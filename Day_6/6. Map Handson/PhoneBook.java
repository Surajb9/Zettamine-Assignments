package com.zettamine.phoneManipulation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class PhoneBook {
	
	private List<Contact> phoneBook = new ArrayList<Contact>();

	public PhoneBook() {
		super();
	}

	public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	public void addContact(Contact contactObj) {
		phoneBook.add(contactObj);
	}
	public List<Contact> viewAllContacts() {
		return phoneBook;
	}
	public Contact viewContactByPhoneNo(long phoneNumber) {
		 Iterator<Contact> it = phoneBook.iterator();
		 while(it.hasNext()) {
			 Contact c = it.next();
			 if(c.getPhoneNumber() == phoneNumber ) {
				 return c;
			 }
					 
		 }
		 return null;
	}
	public boolean removeContact(long phoneNumber) {
		 Iterator<Contact> it = phoneBook.iterator();
		 while(it.hasNext()) {
			 Contact c = it.next();
			 if(c.getPhoneNumber() == phoneNumber ) {
				 phoneBook.remove(c);
				 return true;
			 }
					 
		 }
		 return false;
	}
	
}
