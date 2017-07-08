package com.java.spring.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	//Default Student Constructor 
	public Student(){
	
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("IN", "India");
		countryOptions.put("DE", "Germany");
		countryOptions.put("FR", "France");
		countryOptions.put("US", "United States of America");
		countryOptions.put("AUS", "Australia");
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	
	
	
}
