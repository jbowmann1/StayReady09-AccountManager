package com.codedifferently.bankaccountlab;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainApplication {

    private static ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    private static int currentAccountIndex;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedName, expectedBalance);

        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedCompany, expectedTaxId, expectedBalance2);

        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedName2, expectedRates, expectedBalance3);

        double savingAccountBalance = 300000.0, withdraw, deposit;
        double checkingAccountBalance = 100000.0, withdraw2, deposit2;
        double businessAccountBalance = 200000.0, withdraw3, deposit3;

        System.out.println("Welcome to the ATM");
        System.out.println("Choose 1 to create account");
        System.out.println("Choose 2 to view account");
        System.out.println("Choose 3 to delete account");
        System.out.println("Choose 4 to withdraw from an account");
        System.out.println("Choose 5 to deposit from an account");
        System.out.println("Choose the operation you want to perform");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        switch (n) {
            case 1:
                createAccount();
                break;

            case 2:
                viewAccount();
                break;

            case 3:
                deleteAccount();
                break;

            case 4:
                withdrawFromAccount();
                break;

            case 5:
                depositIntoAccount();
                break;
        }
    }

    public static void createAccount() {
        System.out.println("Create an account!");
        System.out.println("Choose 1 to make a Checking Account");
        System.out.println("Choose 2 to make a Savings Account");
        System.out.println("Choose 3 to make a Business Account");
        System.out.println("Choose 4 to EXIT");

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch (n) {
            case 1:
                createCheckingAccount();
                break;
            case 2:
                createSavingsAccount();
                break;
            case 3:
                createBusinessAccount();
                break;
            case 4:
                System.out.println("Not an available selection, select again");
                createAccount();
                break;
        }
    }

    public static void createCheckingAccount() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the information below: ");
        System.out.println("Enter your name");
        String name = s.nextLine();

        System.out.println("Create your account number");
        int accountNumber = s.nextInt();

        System.out.println("The fees for this account will go as followed");
        double fees = s.nextDouble();

        System.out.println("Your new balance is");
        double balance = s.nextDouble();

        System.out.println("What will your first deposit be?");
        double initalDeposit = s.nextDouble();

        CheckingAccount checkingAccount = new CheckingAccount(accountNumber, name, fees, balance);

        accounts.add(checkingAccount);
    }

    public static void createSavingsAccount() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = s.next();

        System.out.println("Create your account number");
        int accountNumber = s.nextInt();

        System.out.println("The fees for this account will go as followed");
        double fees = s.nextDouble();

        System.out.println("The rates for this account will go as followed");
        double rates = s.nextDouble();

        System.out.println("Your new balance is");
        double balance = s.nextDouble();

        System.out.println("What will your first deposit be?");
        double initialDeposit = s.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, fees, name, rates, balance);
        accounts.add(savingsAccount);
    }

    public static void createBusinessAccount() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Company Name");
        String company = s.nextLine();

        System.out.println("Create your account number");
        int accountNumber = s.nextInt();

        System.out.println("What is your taxId");
        int taxId = s.nextInt();

        System.out.println("The fees for this account will go as followed");
        double fees = s.nextDouble();

        System.out.println("The balance for this account will go as followed");
        double balance = s.nextDouble();

        System.out.println("What will your first deposit be?");
        double initialDeposit = s.nextDouble();

        BusinessAccount businessAccount = new BusinessAccount(accountNumber, fees, company, taxId, balance);
        accounts.add(businessAccount);
    }

    public static void viewAccount() {
        Scanner s = new Scanner(System.in);
        System.out.println("What's your accountNumber");
        int accountNumber = s.nextInt();
    }

    public static void loginChoices() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome! Here is a list of options to chose from");

        System.out.println("Choose 1 to deposit");
        System.out.println("Choose 2 to withdraw");
        System.out.println("Choose 3 to check balance");
        System.out.println("Choose 4 to Delete Account");

        int userChoice = s.nextInt();

        //non plural
        loginChoice(userChoice);
    }

    public static void loginChoice(int userChoice) {
        switch (userChoice) {
            case 1:
                depositIntoAccount();
                break;
            case 2:
                withdrawFromAccount();
                break;
            case 3:
                accountBalance();
                break;
            case 4:
                deleteAccount();
                break;
        }
    }

    public static void depositIntoAccount() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter deposit amount");
        double depositAmt = s.nextDouble();

        //gets the most recent account in use, and deposits
        accounts.get(currentAccountIndex).deposit(depositAmt);

        System.out.println("Your new balance is: " + accounts.get(currentAccountIndex).getBalance());
        loginChoices();
    }

    public static void withdrawFromAccount() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter withdraw amount");
        double withdrawAmt = s.nextDouble();

        //gets the most recent account in use, and deposits
        if (accounts.get(currentAccountIndex).withdraw(withdrawAmt)) {
            System.out.println("Your new balance is: " + accounts.get(currentAccountIndex).getBalance());
        } else {
            //returns the withdraw error message defined in the method
            accounts.get(currentAccountIndex).withdraw(withdrawAmt);
        }
        loginChoices();
    }

    public static void accountBalance() {
        Scanner s = new Scanner(System.in);
        System.out.println("Your balance is: " +
                accounts.get(currentAccountIndex).getBalance());
        loginChoices();
    }

    public static void deleteAccount() {
        Scanner s = new Scanner(System.in);
        System.out.println("Are you sure you want to delete your account");
        String input = s.next();

        if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("Y")) {
            accounts.remove(accounts.get(currentAccountIndex));
            System.out.println("Account deleted");
        }
    }
}
