package com.Generic;

public class Product{
	String id,name;
	public Product(String id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+"\t"+name;
	}

}
