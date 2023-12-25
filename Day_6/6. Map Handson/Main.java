package com.zettamine.phoneManipulation;

import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        PhoneBook pBook = new PhoneBook();
        int choice = 0;
        while (choice!=5) {
            System.out.println("Menu");
            System.out.println("1. Add Contact");
            System.out.println("2. Display all Contacts");
            System.out.println("3. Search Contact by phone");
            System.out.println("4. Remove Contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add a Contact:");
                    System.out.println();
                    scan.nextLine();
                    System.out.print("Enter the First Name: ");
                    String fName = scan.nextLine();
                    System.out.print("Enter the Last Name: ");
                    String lName = scan.nextLine();
                    System.out.print("Enter the Phone No.: ");
                    long phoneNum = scan.nextLong();
                    System.out.print("Enter the Email: ");
                    scan.nextLine();
                    String email = scan.nextLine();
                    Contact c = new Contact(fName, lName, phoneNum, email);
                    pBook.addContact(c);
                    System.out.println("Contact Added Successfully");
                    break;

                case 2:
                    List<Contact> displayContacts = pBook.viewAllContacts();
                
                    if(!displayContacts.isEmpty()) {
                    	 System.out.println("The contacts in the List are:");
                         for (Contact contact : displayContacts) {
                             System.out.println("First Name: " + contact.getFirstName() +
                                     " | Last Name: " + contact.getLastName() +
                                     " | Phone No.: " + contact.getPhoneNumber() +
                                     " | Email: " + contact.getEmailId());
                         }
                    }
                    else{
                    	System.out.println("No Contacts Exists ");
                    }
                    break;

                case 3:
                    System.out.print("Enter the Phone number to search contact : ");
                    long phoneNo = scan.nextLong();
                    Contact contact = pBook.viewContactByPhoneNo(phoneNo);
                    if (contact != null) {
                        System.out.println("The contact is:");
                        System.out.println("First Name: " + contact.getFirstName() +
                                " | Last Name: " + contact.getLastName() +
                                " | Phone No.: " + contact.getPhoneNumber() +
                                " | Email: " + contact.getEmailId());
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the Phone number to remove : ");
                    long phoneNoRemove = scan.nextLong();
                    System.out.print("Do you want to remove the contact (Y/N): ");
                    String confirm = scan.next();

                    if (confirm.equalsIgnoreCase("Y")) {
                        boolean remove = pBook.removeContact(phoneNoRemove);
                        if (remove) {
                            System.out.println("The contact is successfully deleted.");
                        } else {
                            System.out.println("Contact not deleted as it is not found.");
                        }
                    } else {
                        System.out.println("Enter valid input");
                    }
                    break;

                case 5:
                    System.out.println("Exited Successfully");
                    System.exit(0);

                default:
                    System.out.println("Enter Valid input");
            }
        }
        scan.close();

	}

}
