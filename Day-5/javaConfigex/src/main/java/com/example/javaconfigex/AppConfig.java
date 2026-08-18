package com.example.javaconfigex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {
        Address address = new Address();
        address.setCity("Kuppam");
        address.setState("Andhra Pradesh");
        return address;
    }

    @Bean
    public Customer customer() {
        Customer customer = new Customer();
        customer.setAcno(101);
        customer.setName("rdp");
        customer.setAddress(address());
        return customer;
    }

    @Bean
    public BankAccount account() {
        BankAccount account = new BankAccount();
        account.setAcno(1001);
        account.setActype("Savings");
        account.setBal(9999);
        account.setCustomer(customer());
        return account;
    }


}
