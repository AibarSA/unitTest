package com.epam.unitTests;

import  com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CalculatorTest {

    Calculator calculator = new Calculator();
    //test123456++



    // test dividing by zero0
    @Test(expectedExceptions = {NumberFormatException.class})
    public void testExeptionDivLong(){
        long result = calculator.div(5, 0);
    }


    // test for sum long
    @Test(dataProvider="testDataSumLong", dataProviderClass = DataProviderClass.class)
    public void testSumLong(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    // test for sum double
    @Test(dataProvider="testDataSumDouble", dataProviderClass = DataProviderClass.class)
    public void testSumDouble(double firstNumber, double secondNumber, double expectedResult){
        double result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }


    // test for sub long
    @Test(dataProvider="testDataSubLong", dataProviderClass = DataProviderClass.class)
    public void testSubLong(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }



    // test for sub double
    @Test(dataProvider="testDataSubDouble", dataProviderClass = DataProviderClass.class)
    public void testSubDouble(double firstNumber, double secondNumber, double expectedResult){
        double result = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }



    // test for mult long
    @Test(dataProvider="testDataMultLong", dataProviderClass = DataProviderClass.class, enabled=false)
    public void testMultLong(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }



    // test for mult double
    @Test(dataProvider="testDataMultDouble", dataProviderClass = DataProviderClass.class, enabled=false)
    public void testMultDouble(double firstNumber, double secondNumber, double expectedResult, double delta){
        double result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult, delta);
    }



    // test for div long
    @Test(dataProvider="testDataDivLong", dataProviderClass = DataProviderClass.class)
    public void testDivLong(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }



    // test for div double
    @Test(dataProvider="testDataDivDouble", dataProviderClass = DataProviderClass.class)
    public void testDivDouble(double firstNumber, double secondNumber, double expectedResult, double delta){
        double result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult, delta);
    }



    // test for pow
    @Test(dataProvider="testDataPow", dataProviderClass = DataProviderClass.class, enabled=false)
    public void testPow(double firstNumber, double secondNumber, double expectedResult, double delta){
        double result = calculator.pow(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult, delta);
    }



    // test for sqrt
    @Test(dataProvider="testDataSqrt", dataProviderClass = DataProviderClass.class, enabled=false)
    public void testSqrt(double Number, double expectedResult, double delta){
        double result = calculator.sqrt(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }



    // test for tg
    @Test(dataProvider="testDataTg", dataProviderClass = DataProviderClass.class, enabled=false)
    public void testTg(double Number, double expectedResult, double delta){
        double result = calculator.tg(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }



    // test for ctg
    @Test(dataProvider="testDataCtg", dataProviderClass = DataProviderClass.class, enabled=false)
    public void testCtg(double Number, double expectedResult, double delta){
        double result = calculator.ctg(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }



    // test for cos
    @Test(dataProvider="testDataCos", dataProviderClass = DataProviderClass.class, enabled=false)
    public void testCos(double Number, double expectedResult, double delta){
        double result = calculator.cos(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }



    // test for sin
    @Test(dataProvider="testDataSin", dataProviderClass = DataProviderClass.class)
    public void testSin(double Number, double expectedResult, double delta){
        double result = calculator.sin(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }



    // test for isPositive
    @Test(dataProvider="testDataIsPositive", dataProviderClass = DataProviderClass.class)
    public void testIsPositive(long Number, Boolean expectedResult){
        Boolean result = calculator.isPositive(Number);
        Assert.assertEquals(result,expectedResult);
    }



    // test for IsNegative
    @Test(dataProvider="testDataIsNegative", dataProviderClass = DataProviderClass.class)
    public void testIsNegative(long Number, Boolean expectedResult){
        Boolean result = calculator.isNegative(Number);
        Assert.assertEquals(result,expectedResult);
    }



}
