package com.zettamine.day2;

public class Ticket {
       
	 private int ticketid;
	 private int price;
	 private static int availableTickets;
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getAvailableTickets() {
		return availableTickets;
	}
	public static void setAvailableTickets(int availableTickets) {
		if(availableTickets > 0) {
		Ticket.availableTickets = availableTickets;
		}
		else {
			System.err.println("Enter Valid AvailableTickets Number");
			System.exit(0);
		}
	}
	public Ticket(int ticketid, int price) {
		super();
		this.ticketid = ticketid;
		this.price = price;
	}
	public int calculateTicketCost(int noOftickets) {
		if(noOftickets <= availableTickets ) {
		int totalAmount = noOftickets*price;
		return totalAmount;
	}
		return -1;
}
}
