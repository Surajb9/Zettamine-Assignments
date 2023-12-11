package com.day1;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		//Scanning the required inputs
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of pizzas bought: ");
		int noPizzas = scan.nextInt();
		System.out.print("Enter the no of puffs bought: ");
		int noPuffs = scan.nextInt();
		System.out.print("Enter the no of coolDrinks bought: ");
		int noCoolDrinks = scan.nextInt();
		System.out.println();
		System.out.println();
		billGenerator(noPizzas,noPuffs,noCoolDrinks);
		scan.close(); 
	}
    // Method to print bill details.
	private static void billGenerator(int pizzas, int puffs, int coolDrinks) {
		//Calculating item costs
	
		int pizzaTotal = pizzas*100;
		int puffTotal = puffs*20;
		int cDrinksTotal = coolDrinks*10;
		
		int totalPrice = pizzaTotal+puffTotal+cDrinksTotal;
	   // Printing individual number of item with their total costs
	   System.out.println("Bill Details");
       System.out.println("No of Pizzas:     "+ pizzas+"\t Cost: "+pizzaTotal);	
       System.out.println("No of Puffs :     "+ puffs+"\t Cost: "+puffTotal);	
       System.out.println("No of CoolDrinks: "+coolDrinks+"\t Cost: "+cDrinksTotal);	
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println();
       //Printing Total Bill Amount
       System.out.println("Total price :" +totalPrice);
       System.out.println("ENJOY THE SHOW!!!!!!!!!!!");
		
	}

}
