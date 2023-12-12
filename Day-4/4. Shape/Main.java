package com.zettamine.day4.shape;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Shape [] arr = new Shape[5];
		System.out.println("Enter base of Triangle 1:");
		double  base1 = scan.nextDouble();
		System.out.println("Enter height of Triangle 1:");
        double height1 = scan.nextDouble();
        System.out.println();
        arr[0]= new Triangle(base1,height1);
        System.out.println("Enter the Radius of Sphere :");
        double rad = scan.nextDouble();
        arr[1] = new Sphere(rad);
        System.out.println();
        System.out.println("Enter the length of Rectangle :");
        double recLength = scan.nextDouble();
        System.out.println("Enter the width of Rectangle :");
        double recWidth = scan.nextDouble();
        System.out.println();
        arr[2] = new Rectangle(recLength,recWidth);
        System.out.println("Enter the length of Cube : ");
        double cubel = scan.nextDouble();
        System.out.println("Enter the width of Cube : ");
        double cubew = scan.nextDouble();
        System.out.println("Enter the height of Cube : ");
        double cubeh = scan.nextDouble();
        System.out.println();
        arr[3] = new Cube(cubel,cubew,cubeh);
        System.out.println("Enter base of Triangle 2:");
		double  base2 = scan.nextDouble();
		System.out.println("Enter height of Triangle 2:");
        double height2 = scan.nextDouble();
        arr[4]= new Triangle(base2,height2);
        System.out.println();
        System.out.println("Area of Triangle 1 :"+arr[0].area());
        System.out.println("Area of Sphere :"+arr[1].area());
        System.out.println("Volume of Sphere :"+arr[1].volume());
        System.out.println("Area of Rectangle :"+arr[2].area());
        System.out.println("Area of Cube :"+arr[3].area());
        System.out.println("Volume of Cube :"+arr[3].volume());
        System.out.println("Area of Triangle 2 :"+arr[4].area());
        
	}

}
