package com.techment.assignment3;

import java.util.Scanner;

public class TestCard{
	public static void main(String[] args) {
		TravelCard tCard = new TravelCard();
		
		tCard.cardNo = 1234;
		
		int menuInput = 0;
		
		boolean exiting = true;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("\n-------------------------------------------");
		System.out.println(" * * Welcome To Card Seva * * ");
		System.out.println("-------------------------------------------");
		System.out.println("\nCard Number : " + tCard.cardNo);
		
		do {
			
			System.out.println("-------------------");
			System.out.println(" 1 : Recharge Card...");
			System.out.println(" 2 : Swipe Card...");
			System.out.println(" 3 : Card Information...");
			System.out.println(" 0 : Exit...");
			
			if(sc.hasNextInt()) {
				menuInput = sc.nextInt();
			}else {
				exiting = false;
			}
			
			switch(menuInput) {
				case 1 :
					System.out.print("\nEnter Amount to Recharge : ");
					double reAmount = sc.nextDouble();
					tCard.rechargeCard(reAmount);
					
					break;
					
				case 2 :
					System.out.print("\nEnter Amount to Swipe : ");
					double swAmount = sc.nextDouble();
					boolean checking = tCard.swipeCard(swAmount);
					if(checking) {
						System.out.println("\nSwipe Successfull !");
						tCard.CardInfo();
					}else {
						System.out.println("\nSwipe Failed ! Insuffient Balance.");
					}
					break;
					
				case 3 :
					tCard.CardInfo();
					break;
					
				case 0 : 
					exiting = false;
					System.out.println("Exited...");
					break;
					
				default : 
					System.out.println("\nInvalid Operation...");
			}
			
		}while(exiting);
	}
}