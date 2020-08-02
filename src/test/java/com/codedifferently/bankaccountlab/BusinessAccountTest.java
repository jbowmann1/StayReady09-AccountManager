package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

public class BusinessAccountTest {

    @Test
    public void constructorTest(){
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedCompany, expectedTaxId, expectedBalance2);

        //When
        String expectedString = expectedAccountNumber2 +" "+ expectedFees2 +" "+ expectedCompany +" "+ expectedTaxId +" "+ expectedBalance2;


        //Then
        Assert.assertTrue(expectedString.equals(businessAccount.toString2()));
    }

    @Test
    public void getAccountNumber2Test(){
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedCompany, expectedTaxId, expectedBalance2);

        //When
        int actualAccountNumber2 = businessAccount.getAccountNumber2();
        System.out.println(actualAccountNumber2);

        //Then
        Assert.assertEquals(expectedAccountNumber2, actualAccountNumber2);
    }

    @Test
    public void getExpectedFees2Test() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedCompany, expectedTaxId, expectedBalance2);

        //When
        double actualFees2 = businessAccount.getFees2();
        System.out.println(actualFees2);

        //Then
        Assert.assertEquals(expectedFees2, actualFees2, 0.0);
    }

    @Test
    public void getExpectedCompanyTest() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedCompany, expectedTaxId, expectedBalance2);

        //When
        String actualCompany = businessAccount.getCompany();
        System.out.println(actualCompany);

        //Then
        Assert.assertEquals(expectedCompany, actualCompany);
    }

    @Test
    public void getExpectedTaxIdTest() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedCompany, expectedTaxId, expectedBalance2);

        //When
        int actualTaxId = businessAccount.getTaxId();
        System.out.println(actualTaxId);

        //Then
        Assert.assertEquals(expectedTaxId, actualTaxId);
    }

    @Test
    public void getExpectedBalance2Test() {
        //Given
        int expectedAccountNumber2 = 4753;
        double expectedFees2 = 12.0;
        String expectedCompany = "JP Morgan Chase";
        int expectedTaxId = 10;
        double expectedBalance2 = 200000.0;
        BusinessAccount businessAccount = new BusinessAccount(expectedAccountNumber2, expectedFees2, expectedCompany, expectedTaxId, expectedBalance2);

        //When
        double actualBalance2 = businessAccount.getBalance2();
        System.out.println(actualBalance2);

        //Then
        Assert.assertEquals(expectedBalance2, actualBalance2, 0.0);
    }

}
