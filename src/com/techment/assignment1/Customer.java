package com.techment.assignment1;

public class Customer{
	private String customerName;
	private Address residentialAddress;
	
	
	public Customer(){
		
	}
	public Customer(String customerNameInput , Address residentialAddressInput) {
		this.customerName = customerNameInput;
		this.residentialAddress = residentialAddressInput;
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

	
	public String getCustomerDetails() {
		String str = "\nCustomer Name : " + customerName + "\nResidential Address : " + residentialAddress;
		return str;
	}
	
	
}