package com.techment.assignment4;

import com.techment.assignment4.Address;

public class Customer{
	private String customerName;
	private Address residentialAddress;
	private Address officialAddress;
	
	
	public Customer(){
		
	}
	public Customer(String customerNameInput , Address residentialAddressInput , Address officialAddressInput) {
		this.customerName = customerNameInput;
		this.residentialAddress = residentialAddressInput;
		this.officialAddress = officialAddressInput;
	}

	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}
	public Address getOfficialAddress() {
		return officialAddress;
	}

	
	public String getCustomerDetails() {
		String str = "\nCustomer Name : " + customerName + "\nResidential Address : " + residentialAddress + "\nOfficial Address : " + officialAddress;
		return str;
	}
	
	
	
}