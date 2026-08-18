package com.example.demo;

public class Address {
	    String city;
	    String state;
	   
//	    public Address(String city, String state) {
//	        this.city = city;
//	        this.state = state;
//	    }
	    public void setCity(String city) {
			this.city = city;
		}

		public void setState(String state) {
			this.state = state;
		}
		
	   

		public void disaddress() {
	        System.out.println("City: " + city);
	        System.out.println("State: " + state);
	    }

		
		
	
}
