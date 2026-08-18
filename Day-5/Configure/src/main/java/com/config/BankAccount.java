package com.config;

import org.springframework.stereotype.Component;

@Component
public class BankAccount {

    private int accountNo;
    private String accountType;
    private double balance;
    private Customer customer;

    public BankAccount() {
    }

    public BankAccount(int accountNo, String accountType, double balance, Customer customer) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.balance = balance;
        this.customer = customer;
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
        customer.displayCustomer();
    }
}