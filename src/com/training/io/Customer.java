package com.training.io;

public class Customer {
	private String customer_id;	
	private String customer_name;	
	private String  gender;	
	private String city;
	
	//CONSTRUCTOR
	public Customer(String customer_id, String customer_name, String gender, String city) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.gender = gender;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", gender=" + gender
				+ ", city=" + city + "]";
	}

	
	
	


}
