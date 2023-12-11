package com.day1;

import java.util.Scanner;

public class StringConcatenation {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.print("Inmate's name :");
		String s1 = scan.nextLine();
		System.out.print("Inmate's father's name :");
		String s2 = scan.nextLine();
		fatherNameConcat(s1,s2);
		scan.close();
		
	}
	public static void fatherNameConcat(String s1,String s2) {
		s2 = s1.concat(" "+s2).toUpperCase();
		boolean stringValidate = s2.matches("[A-Z ]+");
		if(stringValidate) {
		   System.out.println(s2);
		}
		else {
			System.err.println("INVALID NAME");
			System.exit(0);
			
		}
	}

}
