package com.training.io;

import java.io.Serializable;

public class Customer implements Serializable {
	
	
	private static final long serialVersionUID = 7110846953258140185L;
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
	
	
	/**
	 * @return the customer_id
	 */
	public String getCustomer_id() {
		return customer_id;
	}


	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}


	/**
	 * @return the customer_name
	 */
	public String getCustomer_name() {
		return customer_name;
	}


	/**
	 * @param customer_name the customer_name to set
	 */
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}


	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}


	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", gender=" + gender
				+ ", city=" + city + "]";
	}

	
	
	


}
