package com.codedifferently.bankaccountlab;

public class SavingsAccount extends BankAccount{

    private int accountNumber;
    private double fees;
    private String name;
    private double rates;
    private double balance;

    public SavingsAccount(int accountNumber, double fees, String name, double rates, double balance){
        this.accountNumber = accountNumber;
        this.fees = fees;
        this.name = name;
        this.rates = rates;
        this.balance = balance;
    }

    public int getAccountNumber3() {
        return accountNumber;
    }

    public void setAccountNumber3(int accountNumber3) {
        this.accountNumber = accountNumber;
    }

    public double getFees3() {
        return fees;
    }

    public void setFees3(double fees3) {
        this.fees = fees3;
    }

    public String getName2() {
        return name;
    }

    public void setName2(String name2) {
        this.name = name2;
    }

    public double getRates() {
        return rates;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }

    public double getBalance3() {
        return balance;
    }

    public void setBalance3(double balance) {
        this.balance = balance;
    }

    public String toString3(){
        return accountNumber +" "+ fees +" "+ name +" "+ rates +" "+ balance;
    }

    @Override
    public void deposit(double depositAmt) {

    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public boolean withdraw(double withdrawAmt) {
        return false;
    }
}
