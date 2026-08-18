package com.example.javaconfigex;
import org.springframework.stereotype.Component;

@Component
public class Address {

    private String city;
    private String state;

    public Address() {
    }


    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public void disAddress() {
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }
}