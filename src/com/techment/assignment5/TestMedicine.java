package com.techment.assignment5;

import java.util.Random;
import java.util.Scanner;

public class TestMedicine{
	public static void main(String[] args) {
		Medicine med[] = new Medicine[5];
		
		Random r = new Random();
		int num = r.nextInt(3) + 1; // + 1 because Random(max) generates integer from 0 to max-1 so here 0+1 to max
		
		switch(num) {
		case 1 : 
			Tablet tab = new Tablet();
			tab.getDetails();
			tab.displayLabel();
			break;
			
		case 2 :
			Syrup syrup = new Syrup();
			syrup.getDetails();
			syrup.displayLabel();
			break;
			
		case 3 : 
			Ointment ointment = new Ointment();
			ointment.getDetails();
			ointment.displayLabel();
			break;
			
		default:
			System.out.println("Refresh the Page for Medicine Details");
		}
	}
}