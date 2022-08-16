package com.techment.assignment3;

import java.util.Scanner;

public class TravelCard extends PrepaidCard{
	double rewardPoints;
	
	@Override
	public double rewardPointsInfo(double amount) {
		if( (amount/100) >= 1 ) {
			return (amount/100)*5;			
		}else {
			return 0;
		}
	}
	
	@Override
	public boolean swipeCard(double amount) {
		if(amount > this.availableBalance) {
			return false;
		}else {
			this.availableBalance = this.availableBalance - amount;
			this.rewardPoints = this.rewardPoints + this.rewardPointsInfo(amount);
			return true;
		}
	}
	
	
	public void rechargeCard(double amount) {
		this.availableBalance = this.availableBalance + amount;
		System.out.println("\nRecharge Successfull ! Current Balance is : " + this.availableBalance);
	}
	
	
	public void CardInfo() {
		System.out.println("----------------------------------------");
		System.out.println("Card Number : " + this.cardNo + "\nReward Points : " + this.rewardPoints + "\nAvailable Balance : " + this.availableBalance);
		System.out.println("----------------------------------------");
	}
	
}