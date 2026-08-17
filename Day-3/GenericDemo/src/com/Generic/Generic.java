package com.Generic;

public class Generic {

	public static void main(String[] args) {
		Display<Integer> dis=new Display<>(200);
		Display<String>  st=new Display<String>("RDP");
		System.out.println(dis.getRef());
		System.out.println(st.getRef());
		Display<Product> d3=new Display<Product>(new Product("101","RDP"));
		System.out.println(d3.getRef());
	}

}
