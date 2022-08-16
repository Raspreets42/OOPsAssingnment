package com.techment.assignment2;

import java.util.Scanner;

public class BookDetails{
	public static void main(String[] args) {
		int bookNo;
		String bookTitle , bookAuthor , bookCategory;
		float bookPrice;
		
		Book b = new Book();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Book No : ");
		bookNo = sc.nextInt();
		
		System.out.print("Book Title : ");
		bookTitle = sc.nextLine();
		
		System.out.print("Book Author : ");
		bookAuthor = sc.nextLine();
	
		System.out.print("Book Category : ");
		bookCategory = sc.nextLine();
		
		System.out.print("Book Price : ");
		bookPrice = sc.nextFloat();
		
		b.setBookNo(bookNo);
		b.setTitle(bookTitle);
		b.setAuthor(bookAuthor);
		b.setPrice(bookPrice);
		b.setCategory(bookAuthor);
		
		System.out.println("Book Number : " + b.getBookNo());
		System.out.println("Book Title : " + b.getTitle());
		System.out.println("Book Author : " + b.getAuthor());
		System.out.println("Book Category : " + b.getCategory());
		System.out.println("Book Price : " + b.getPrice());
		
	}
}