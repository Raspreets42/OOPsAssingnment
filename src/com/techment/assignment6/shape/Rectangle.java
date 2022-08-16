package com.techment.assignment6.shape;

public class Rectangle implements Polygon{
	float length = 4 , breadth = 3;
	
	@Override
	public void calculateArea() {
		float area = length * breadth;
		System.out.println("\nArea of Rectangle : " + area);
	}
	
	@Override
	public void calculatePerimeter() {
		float perimeter = 2*(length + breadth);
		System.out.println("\nPerimeter of Rectangle : " + perimeter);
	}
}