package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class SavingsAccountTest {

    @Test
    public void constructorTest(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedName2, expectedRates, expectedBalance3);

        //When
        String expectedString = expectedAccountNumber3 +" "+ expectedFees3 +" "+ expectedName2 +" "+ expectedRates +" "+expectedBalance3;


        //Then
        Assert.assertTrue(expectedString.equals(savingsAccount.toString3()));
    }

    @Test
    public void getAccountNumber3Test(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedName2, expectedRates, expectedBalance3);

        //When
        int actualAccountNumber3 = savingsAccount.getAccountNumber3();
        System.out.println(actualAccountNumber3);

        //Then
        Assert.assertEquals(expectedAccountNumber3, actualAccountNumber3);
    }

    @Test
    public void getFees3Test(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedName2, expectedRates, expectedBalance3);

        //When
        double actualFees3 = savingsAccount.getFees3();
        System.out.println(actualFees3);

        //Then
        Assert.assertEquals(expectedFees3, actualFees3, 0.0);
    }

    @Test
    public void getName2Test(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedName2, expectedRates, expectedBalance3);

        //When
        String actualName2 = savingsAccount.getName2();
        System.out.println(actualName2);

        //Then
        Assert.assertEquals(expectedName2, actualName2);
    }

    @Test
    public void getRatesTest(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedName2, expectedRates, expectedBalance3);

        //When
        double actualRates = savingsAccount.getRates();
        System.out.println(actualRates);

        //Then
        Assert.assertEquals(expectedRates, actualRates, 0.0);
    }

    @Test
    public void getBalance3Test(){
        //Given
        int expectedAccountNumber3 = 6390;
        double expectedFees3 = 12.0;
        String expectedName2 = "Josh";
        double expectedRates = 8.0;
        double expectedBalance3 = 300000.0;
        SavingsAccount savingsAccount = new SavingsAccount(expectedAccountNumber3, expectedFees3, expectedName2, expectedRates, expectedBalance3);

        //When
        double actualBalance3 = savingsAccount.getBalance3();
        System.out.println(actualBalance3);

        //Then
        Assert.assertEquals(expectedBalance3, actualBalance3, 0.0);
    }
}
