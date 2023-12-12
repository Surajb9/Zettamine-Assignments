package com.zettamine.day4.shape;

public class Sphere extends Shape implements Spatial {
	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double area = 4*Math.PI*radius * radius;
		return area;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		double volume = ( 4  * Math.PI * radius * radius * radius ) / 3;
		return volume;
	}

}
