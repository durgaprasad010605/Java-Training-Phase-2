package com.example.javaconfigex;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    private int acno;
    private String name;
    private Address address;

    public Customer() {
    }

    public Customer(int acno, String name, Address address) {
        this.acno = acno;
        this.name = name;
        this.address = address;
    }

    public void displayCustomer() {
        System.out.println("Account No: " + acno);
        System.out.println("Name: " + name);
        address.disAddress();
    }

    public void setAcno(int i) {
        this.acno = i;
    }

    public void setName(String name) {
        this.name = name;
    }

        public void setAddress(Address address) {
        this.address = address;
    }
}