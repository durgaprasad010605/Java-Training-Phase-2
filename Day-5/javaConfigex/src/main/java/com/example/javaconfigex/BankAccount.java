package com.example.javaconfigex;
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

    public void setAcno(int i) {
        this.accountNo = i;
    }
    public void setActype(String type) {
        this.accountType = type;
    }
    public void setBal(double balance) {
        this.balance = balance;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

}