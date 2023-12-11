package com.day1;

import java.util.Scanner;

public class DisplayCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 4 Numbers:");
		int one = scan.nextInt();
		int two = scan.nextInt();
		int three = scan.nextInt();
		int four = scan.nextInt();
		magicBoard(one,two,three,four);
		scan.close();
	}

	private static void magicBoard(int a, int b, int c, int four) {
		// TODO Auto-generated method stub
		char first = (char) a;
		char second = (char) b;
		char third = (char) c;
		char fourth = (char) four;
		System.out.println(a+"-"+ first);
		System.out.println(b+"-"+ second);
		System.out.println(c+"-"+ third);
		System.out.println(four+"-"+fourth);
		
	}

}

