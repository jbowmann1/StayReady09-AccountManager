package com.codedifferently.bankaccountlab;

public class BusinessAccount extends BankAccount{

    private int accountNumber;
    private double fees;
    private String company;
    private int taxId;
    private double balance;

    public BusinessAccount(int accountNumber, double fees, String company, int taxId, double balance){
        this.accountNumber = accountNumber;
        this.fees = fees;
        this.company = company;
        this.taxId = taxId;
        this.balance = balance;
    }

    public int getAccountNumber2() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber2) {
        this.accountNumber = accountNumber2;
    }

    public double getFees2() {
        return fees;
    }

    public void setFees2(double fees2) {
        this.fees = fees2;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public double getBalance2() {
        return balance;
    }

    public void setBalance2(double balance2) {
        this.balance = balance2;
    }

    public String toString2(){
        return accountNumber +" "+ fees +" "+ company +" "+ taxId +" "+ balance;
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
