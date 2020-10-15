package com.ofss;

public class Customer {
	private String firstName;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + "]";
	}

	public Customer(String firstName) {
		super();
		this.firstName = firstName;
	}

	
	

}
