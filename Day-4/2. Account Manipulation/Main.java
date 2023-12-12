package com.zettamine.day4.accountManipulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.print("enter A/C number: ");
        int acNo = scan.nextInt();
        System.out.println();
        System.out.print("enter customer id: ");
        int custId = scan.nextInt();
        scan.nextLine();
        System.out.println();
        System.out.print("enter customer name: ");
        String custName = scan.nextLine();
        System.out.println();
        System.out.print("enter customer email: ");
        String custEmail = scan.next();
        System.out.println();
        System.out.print("enter balance: ");
        double balance = scan.nextDouble();
        System.out.println();
        System.out.print("enter minimum balance: ");
        double minBalance = scan.nextDouble();
        System.out.println();
        System.out.print("enter amount to withdraw: ");
        double amount = scan.nextDouble();
        System.out.println();
        Customer cust = new Customer(custId,custName,custEmail);
        Account acc = new SavingsAccount(acNo,cust,balance,minBalance);
        boolean result = acc.withdraw(amount);
        if(result) {
        	System.out.printf("Rs. %.2f debited | Balance: %.2f",amount,(balance-amount));
        }
        else {
        	System.out.print("Insufficient Funds");
        }
        scan.close();
        
        
	}

}
