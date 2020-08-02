package com.codedifferently.bankaccountlab;

import org.junit.Test;
import org.junit.Assert;


public class CheckingAccountTest {

    @Test
    public void constructorTest(){
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedName, expectedBalance);

        //When
        String expectedString = expectedAccountNumber +" "+ expectedFees +" "+ expectedName +" "+ expectedBalance;


        //Then
        Assert.assertTrue(expectedString.equals(checkingAccount.toString()));
    }

    @Test
    public void getAccountNumberTest(){
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedName, expectedBalance);

        //When
        int actualAccountNumber = checkingAccount.getAccountNumber();
        System.out.println(actualAccountNumber);

        //Then
        Assert.assertEquals(expectedAccountNumber, actualAccountNumber);
    }

    @Test
    public void getFeesTest(){
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.00;
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedName, expectedBalance);

        //When
        double actualFees = checkingAccount.getFees();
        System.out.println(actualFees);

        //Then
        Assert.assertEquals(expectedFees, actualFees, 0.0);
    }

    @Test
    public void getNameTest(){
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedName, expectedBalance);

        //When
        String actualName = checkingAccount.getName();
        System.out.println(actualName);

        //Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void getBalanceTest(){
        //Given
        int expectedAccountNumber = 3696;
        double expectedFees = 12.0;
        String expectedName = "Josh";
        double expectedBalance = 100000.0;
        CheckingAccount checkingAccount = new CheckingAccount(expectedAccountNumber, expectedFees, expectedName, expectedBalance);

        //When
        double actualBalance = checkingAccount.getBalance();
        System.out.println(actualBalance);

        //Then
        Assert.assertEquals(expectedBalance, actualBalance, 0.0);
    }
}
