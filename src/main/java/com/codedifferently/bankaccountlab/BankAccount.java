package com.codedifferently.bankaccountlab;

public abstract class BankAccount {

    private int accountNumber;
    private int fees;
    private String name;
    private int balance;
    private int rate;
    private String company;
    private int taxId;


    public abstract void deposit(double depositAmt);

    public abstract double getBalance();

    public abstract boolean withdraw(double withdrawAmt);
}
