package com.collections;
import java.util.*;

public class ListDemo {
	public static void main(String args[]) {
		List<Integer> list=new ArrayList<>();
		System.out.println(list.size());
		list.add(10);
		list.add(10);
		list.add(10);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.set(1, 90));
		System.out.println(list);
	}

}
