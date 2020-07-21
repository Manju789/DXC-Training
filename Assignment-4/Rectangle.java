package com.shape;

public class Rectangle implements Polygon{
	public float length,breadth;

	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle : " + length*breadth);
	}

	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of rectangle : " + 2*(length + breadth));
	}
	
}
