package com.zettamine.day4.Hosteller;

import java.util.Scanner;


public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		Hosteller host = getHostellerDetails();
		System.out.println("The Student Details are as follows: ");
		System.out.println();
        System.out.println("Student ID: "+host.getStudentDetails().studentId);
        System.out.println("Student Name: "+host.getStudentDetails().name);
        System.out.println("Department ID: "+host.getStudentDetails().departmentId);
        System.out.println("Student Gender: "+host.getStudentDetails().gender);
        System.out.println("Student Phone No: "+host.getStudentDetails().phone);
        System.out.println("Hostel Name: "+host.getHostelName());
        System.out.println("Room No: "+host.getRoomNumber());

	}
	public static Hosteller getHostellerDetails(){
		System.out.println("Enter the Student Details & Hostel Details: ");
		System.out.print("Student ID: ");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.print("Student Name: ");
		String stuName = scan.nextLine();
		System.out.print("Department Id:  ");
		int deptId = scan.nextInt();
		System.out.print("Gender[M/F]: ");
		String gender = scan.next();
		if(gender.equalsIgnoreCase("M")) {
			gender ="Male";
		}
		if(gender.equalsIgnoreCase("F")) {
			gender = "Female";
		}
		System.out.print("Phone Number: ");
		String phoneNo = scan.next();
		scan.nextLine();
		Student stu = new Student(id,stuName,deptId,gender,phoneNo);
		System.out.print("Hostel Name: ");
		String hostelName = scan.nextLine();
		System.out.print("Room Number: ");
		int roomNo = scan.nextInt();
		System.out.print("Modify Room Number(Y/N): ");
		String roomModify = scan.next();
		if(roomModify.equalsIgnoreCase("Y")) {
			System.out.print("New Room Number: ");
			roomNo = scan.nextInt();
		}
		System.out.print("Modify Phone Number(Y/N): ");
		String phoneNoModify = scan.next();
		if(phoneNoModify.equalsIgnoreCase("Y")) {
			System.out.print("New Phone Number: ");
			phoneNo = scan.next();
		}
		return new Hosteller(hostelName,roomNo,stu);
		
	}

}
