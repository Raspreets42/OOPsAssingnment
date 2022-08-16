package com.techment.assignment6.test;

import java.util.Scanner;

import com.techment.assignment6.shape.*;

public class Test{
	public static void main(String[] args) {
		
		Square sq = new Square();
		sq.calculateArea();
		sq.calculatePerimeter();
		
		Rectangle rect = new Rectangle();
		rect.calculateArea();
		rect.calculatePerimeter();
	}
}