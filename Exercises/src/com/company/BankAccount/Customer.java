package com.company.BankAccount;

public class Customer {
    public static void main(String[] args) {
        Checking checking = new Checking();
        Savings savings = new Savings();

        checking.info();
        savings.info();
    }
}
