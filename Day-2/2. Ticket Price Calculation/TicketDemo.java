package com.zettamine.day2;

import java.util.Scanner;

public class TicketDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Number Of Bookings: ");
		int bookNum = scan.nextInt();
		System.out.println();
		System.out.print("Enter the available tickets: ");
		int availTickets = scan.nextInt();
		for(int i = 0 ;i <bookNum ; i++) {
			System.out.print("Enter the ticketid: ");
			int ticketId = scan.nextInt();
			System.out.print("Enter the price: ");
			int price = scan.nextInt();
			System.out.print("Enter the no of tickets: ");
			int ticketNo = scan.nextInt();
			System.out.println();
			System.out.println("Available tickets: "+ availTickets );
			Ticket t = new Ticket(ticketId,price);
			Ticket.setAvailableTickets(availTickets);
			int totalAmount = t.calculateTicketCost(ticketNo);
			if(totalAmount != -1)
			{System.out.println("Total amount: "+totalAmount);
			availTickets -= ticketNo;
			System.out.println("Available tickets after Booking :"+ availTickets );
			System.out.println();
			}
			else{
				System.out.println("Tickets not avaliable");
			}
			
		}
		scan.close();
		

	}

}
