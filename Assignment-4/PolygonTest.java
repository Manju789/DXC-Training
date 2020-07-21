package com.test;
import com.shape.*;
public class PolygonTest {
	public static void main(String[] args) {
		Square square = new Square();
		Rectangle rectangle = new Rectangle();
		square.side=5;
		rectangle.length = 4;
		rectangle.breadth = 6;
		square.calcArea();
		square.calcPeri();
		rectangle.calcArea();
		rectangle.calcPeri();
		
	}
}
