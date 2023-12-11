package com.day1;

import java.util.Scanner;

public class MovieTicketsCalculation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of ticket: ");
		int noTickets = scan.nextInt();
		if((noTickets < 5) || (noTickets > 40)) {
			System.err.print("Minimum of 5 and Maximum of 40 Tickets");
		}
		else {
			System.out.print("Do you want refreshment: ");
			char refresh = scan.next().charAt(0);
			System.out.print("Do you have coupon code: ");
			char coupon = scan.next().charAt(0);
			System.out.print("Enter the circle: ");
			char circle = scan.next().charAt(0);
			
			if( circle == 'K' || circle == 'Q' ) {
				float totalCost = movieTicketsTotal(noTickets,refresh,coupon,circle);
				System.out.printf("Ticket cost: %.2f",totalCost);
			}
		    
			else {
				System.err.println("Invalid Input");
			}

		}
		scan.close();

	}

	private static float movieTicketsTotal(int noTickets, char refresh, char coupon, char circle) {
		
		float cost = 0;
		switch (circle) {
		case 'K' : cost = 75 * noTickets;
		           break;
		case 'Q' : cost = 150 * noTickets;
		}
		if(refresh == 'y' || refresh == 'Y' ) {
			cost +=  50 * noTickets;
		} 
	    float temp = cost;
		if (noTickets > 20){
			cost -= cost/10;
		}
		if(coupon == 'y' || coupon == 'Y') {
			cost -= temp/50;
		}
		
		return cost;
	}

}
