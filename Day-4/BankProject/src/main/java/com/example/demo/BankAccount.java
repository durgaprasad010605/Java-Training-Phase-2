package com.example.demo;

public class BankAccount {

    int acno;
    String actype;
    double bal;
    Customer customer;

    public BankAccount() {
    }

//    public BankAccount(int acno, String actype, double bal, Customer customer) {
//        this.acno = acno;
//        this.actype = actype;
//        this.bal = bal;
//        this.customer = customer;
//    }

    public void setAcno(int acno) {
			this.acno = acno;
		}

		public void setActype(String actype) {
			this.actype = actype;
		}

		public void setBal(double bal) {
			this.bal = bal;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		

	public void disaccount() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + actype);
        System.out.println("Balance: " + bal);
        customer.discustomer();
    }


}