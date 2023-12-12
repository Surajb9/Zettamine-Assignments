package com.zettamine.day4.shape;


public class Triangle extends Shape {
   
	 
	private  double base;
	 private double height;
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (0.5 * this.base * this.height);
	}
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return -1;
	}
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
}
	
