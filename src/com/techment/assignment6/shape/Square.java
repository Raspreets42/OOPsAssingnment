package com.techment.assignment6.shape;

import java.util.Scanner;

public class Square implements Polygon{
	float side = 4;
	
	
	@Override
	public void calculateArea() {
		float area = side*side;
		System.out.println("\nArea of Square : " + area);
	}
	
	@Override
	public void calculatePerimeter() {
		float perimeter = 4 * side;
		System.out.println("\nPerimeter of Square : " + perimeter);
	}
}