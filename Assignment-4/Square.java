package com.shape;

public class Square implements Polygon{
	public float side;

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("Area of square : " + side*side);
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter of square : " + 4*side);
	}
}
