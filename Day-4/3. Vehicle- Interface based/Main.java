package com.zettamine.day4.VehicleLoanInsurance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Vehicle Number :");
		String vehicleNo = scan.next(); 
		System.out.print("Enter ModelName :");
		String modelName = scan.next();
		scan.nextLine();
		System.out.print("Enter VehicleType :");
		String VehicleType = scan.nextLine();
		System.out.print("Enter Vehice Price :");
		double price = scan.nextDouble();
		if(VehicleType.equalsIgnoreCase("4 wheeler")  || VehicleType.equalsIgnoreCase("3 wheeler")
				|| VehicleType.equalsIgnoreCase("2 wheeler")) {
			Vehicle vehicle = new Vehicle(vehicleNo,modelName,VehicleType,price);
			double loanAmount = vehicle.issueLoan();
			System.out.printf("The eligible loan amount is  %.2f",loanAmount);
			System.out.println();
			double insuranceAmount = vehicle.takeInsurance();
			System.out.printf("Insurance amount is %.2f",insuranceAmount);
		}
		else {
			System.err.println("Invalid Vehicle Type");
		}
		

	}

}
