package com.techment.assignment4;

public class Address{
	private String addressLine , city;
	
	public Address(String addresslineInput , String cityInput) {
		this.addressLine = addresslineInput;
		this.city = cityInput;
	}
	
	@Override
	public String toString() {
		return addressLine + " , " + city ;
	}
	

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressLine() {
		return addressLine;
	}
	public String getCity() {
		return city;
	}	
	

	public String getAddressDetails() {
		String str = addressLine + " , " + city;
		return str;
	}
	
	
}