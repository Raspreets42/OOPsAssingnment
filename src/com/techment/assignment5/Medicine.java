package com.techment.assignment5;

abstract public class Medicine {
	float medicinePrice;
	String medicineExpDate;
	String medicineName;
	
	public String getDetails() {
		String detail = "\nMedicine Name : " + medicineName + "\nMedicine Price : " + medicinePrice + "\nMedicine Expiry Date : " + medicineExpDate;
		return detail;
	}
	
	abstract void displayLabel();
}


class Tablet extends Medicine{
	@Override
	void displayLabel() {
		System.out.println("\n Label (Tablet) : 'Store in a cool dry place.' ");
		
	}
}


class Syrup extends Medicine{
	@Override
	void displayLabel() {
		System.out.println("\n Label (Syrup) : 'Take With Warm Water.' ");
		
	}
}


class Ointment extends Medicine{
	@Override
	void displayLabel() {
		System.out.println("\n Label (Ointment) : 'For External Usage Only' ");
		
	}
}

