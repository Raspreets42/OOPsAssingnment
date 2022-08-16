package com.techment.assignment4;

import com.techment.assignment4.Address;
import com.techment.assignment4.Customer;

public class TestCustomer{
	public static void main(String[] args) {
		
		Customer customer_defaultConstructor = new Customer(  );
		
		customer_defaultConstructor.setCustomerName("defaultConstructor");
		customer_defaultConstructor.setResidentialAddress(new Address("Smriti Nagar" , "Bhilai"));
		customer_defaultConstructor.setOfficialAddress( (new Address("Smriti Nagar Bhilai" , "Durg") ) );
		
		String Details_defaultConstructor = customer_defaultConstructor.getCustomerDetails();
		System.out.println(Details_defaultConstructor);
		
		
		
		Customer customer_parameterizedConstructor = new Customer( "parameterizedConstructor" , new Address("Smriti Nagar" , "Bhilai") , new Address("Smriti Nagar Bhilai" , "Durg") );
		
		String Details_parameterizedConstructor = customer_parameterizedConstructor.getCustomerDetails();
		System.out.println(Details_parameterizedConstructor);
	}
}