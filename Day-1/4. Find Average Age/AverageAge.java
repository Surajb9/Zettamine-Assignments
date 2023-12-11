package com.day1;

import java.util.Scanner;

public class AverageAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter total no. of employees: ");
		int totalEmp = scan.nextInt();
		if(totalEmp < 2) {
			System.err.println("Please enter a valid employee count");
		}
		else {
			int [] ageArr = new int[totalEmp];
			System.out.println("Enter the age for "+ totalEmp +" employees");
			for(int i = 0;i < totalEmp;i++) {
				ageArr[i] = scan.nextInt();	
			}
			calculateAverage(ageArr);
			
		}
		scan.close();
 	}

	private static void calculateAverage(int [] arr) {
		
		int totalAge = 0;
		int count = 0;
		int totalEmp = arr.length;
		float avg =0.0f;
		for(int i = 0;i < arr.length;i++) {	 
			if(arr[i] < 28 || arr[i] > 40) {
				count++;
				break;
			}		
		}
		if(count == 1) {
			System.err.println("Invalid Age Encountered");
		}
		else {
			
			for(int i = 0;i < arr.length;i++) {	 
				totalAge += arr[i];
				}
			avg =totalAge/totalEmp;
			System.out.printf("The average age is: %.2f",avg);
			}
		}
	
		
	}


