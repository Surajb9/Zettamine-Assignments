package com.zettamine.day2;

import java.util.Scanner;

public class StudentDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Student's Id: ");
		int id = scan.nextInt();
		System.out.println();
		System.out.print("Enter Student's Name: ");
		scan.nextLine();
		String name = scan.nextLine();
        System.out.println();
		System.out.print("Enter Student's address: ");
		String address = scan.nextLine();
		System.out.println();
		Student  s1;
		while(true) {
			
			System.out.print("Whether the student is from NIT(Yes/No): ");
			String nit = scan.next().toLowerCase();
			System.out.println();
			
			if(nit.equals("yes")) {
				s1 = new Student(id,name,address);
				break;
			}
			else if(nit.equals("no")) {
				System.out.print("Enter student's college name: ");
				scan.nextLine();
				String collegeName = scan.nextLine();
				s1 = new Student(id,name,address,collegeName);
				break;
			}
			else {
				System.out.println("Wrong Input");
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Student id: "+ s1.getStudentId());
		System.out.println();
		System.out.println("Student name: "+s1.getStudentName());
		System.out.println();
		System.out.println("Address: "+s1.getStudentAddress());
		System.out.println();
		System.out.println("College Name: "+s1.getCollegeName());
		System.out.println();
		
		
	}
}


