package com.techment.assignment3;

abstract class PrepaidCard implements Rewardable{
	int cardNo;
	double availableBalance , swipeLimit;
	
	abstract boolean swipeCard( double amount ) ;
	
	abstract void rechargeCard (double amount);
	
}

