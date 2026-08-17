package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.car.Car;

public class Test {
	public static void main(String args[]) {
		ApplicationContext cntx=new ClassPathXmlApplicationContext("applicationContext.xml");
		Car c=cntx.getBean("car",Car.class);
		c.drive();
	}

}
