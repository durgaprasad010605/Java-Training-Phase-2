package com.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String args[]){
		Set <String> set =new HashSet<>();
		System.out.println(set.size());
		set.add("hello");
		set.add("world");
		System.out.println(set);
		set.remove("hello");
		System.out.println(set);
		
		
		
		
	}

}
