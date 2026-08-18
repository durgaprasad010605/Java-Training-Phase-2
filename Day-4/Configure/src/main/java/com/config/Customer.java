package com.config;
public class Customer {

    int id;
    String name;
    Address address;

    public Customer() {
    }

//    public Customer(int id, String name, Address address) {
//        this.id = id;
//        this.name = name;
//        this.address = address;
//    }
    public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public void discustomer() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        address.disaddress();
    }

	public void setAcno(int i) {
		// TODO Auto-generated method stub
		
	}

   
}
