package com.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CalculatorTest {

    Calculator calculator = new Calculator();

    // test dividing by zero
    @Test(expectedExceptions = {NumberFormatException.class})
    public void testExeptionDivLong(){
        long result = calculator.div(5, 0);
    }

    // test for sum long
    @Test(dataProvider="testDataSumLong")
    public void testSumLong(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataSumLong(){
        return new Object[][]{
                {500, 1000, 1500},
                {70, -100, -30}
        };
    }


    // test for sum double
    @Test(dataProvider="testDataSumDouble")
    public void testSumDouble(double firstNumber, double secondNumber, double expectedResult){
        double result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataSumDouble(){
        return new Object[][]{
                {5.5, 7.3, 12.8},
                {3.5, 4.5, 8.0},
        };

    }

    // test for sub long
    @Test(dataProvider="testDataSubLong")
    public void testSubLong(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataSubLong(){
        return new Object[][]{
                {500, 1000, -500},
                {3500, 1000, 2500}
        };
    }


    // test for sub double
    @Test(dataProvider="testDataSubDouble")
    public void testSubDouble(double firstNumber, double secondNumber, double expectedResult){
        double result = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataSubDouble(){
        return new Object[][]{
                {9.5, 7.3, 2.2},
                {12.5, 4.2, 8.3}
        };
    }


    // test for mult long
    @Test(dataProvider="testDataMultLong")
    public void testMultLong(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataMultLong(){
        return new Object[][]{
                {500, 3, 1500},
                {350, 20, 7000}
        };
    }


    // test for mult double
    @Test(dataProvider="testDataMultDouble")
    public void testMultDouble(double firstNumber, double secondNumber, double expectedResult, double delta){
        double result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataMultDouble(){
        return new Object[][]{
                {5.2, 2.3, 11.96, 0.001},
                {12.5, 4.2, 52.5, 0.001}
        };
    }


    // test for div long
    @Test(dataProvider="testDataDivLong")
    public void testDivLong(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataDivLong(){
        return new Object[][]{
                {1500, 3, 500},
                {700, 20, 35}
        };
    }


    // test for div double
    @Test(dataProvider="testDataDivDouble")
    public void testDivDouble(double firstNumber, double secondNumber, double expectedResult, double delta){
        double result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataDivDouble(){
        return new Object[][]{
                {12.2, 2.0, 6.1, 0.001},
                {12.5, 2.0, 6.25, 0.001},
        };
    }


    // test for pow
    @Test(dataProvider="testDataPow")
    public void testPow(double firstNumber, double secondNumber, double expectedResult, double delta){
        double result = calculator.pow(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataPow(){
       return new Object[][]{
                {3.0, 3.0, 27.0, 0.001},
                {4.0, 2.0, 16.0, 0.001},
        };
    }


    // test for sqrt
    @Test(dataProvider="testDataSqrt")
    public void testSqrt(double Number, double expectedResult, double delta){
        double result = calculator.sqrt(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataSqrt(){
        return new Object[][]{
                {144.0, 12.0, 0.001},
                {900.0, 30.0, 0.001},
        };
    }


    // test for tg
    @Test(dataProvider="testDataTg")
    public void testTg(double Number, double expectedResult, double delta){
        double result = calculator.tg(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataTg(){
        return new Object[][]{
                {1.5, 14.101419947171719, 0.001}
        };
    }


    // test for ctg
    @Test(dataProvider="testDataCtg")
    public void testCtg(double Number, double expectedResult, double delta){
        double result = calculator.ctg(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataCtg(){
        return new Object[][]{
                {1.5, 0.07091484430265245, 0.001}
        };
    }

    // test for cos
    @Test(dataProvider="testDataCos")
    public void testCos(double Number, double expectedResult, double delta){
        double result = calculator.cos(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataCos(){
        return new Object[][]{
                {2.5, -0.8011436155469337, 0.001}
        };
    }


    // test for sin
    @Test(dataProvider="testDataSin")
    public void testSin(double Number, double expectedResult, double delta){
        double result = calculator.sin(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataSin(){
        return new Object[][]{
                {2.5, 0.5984721441039564, 0.001}
        };
    }


    // test for isPositive
    @Test(dataProvider="testDataIsPositive")
    public void testIsPositive(long Number, Boolean expectedResult){
        Boolean result = calculator.isPositive(Number);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataIsPositive(){
        return new Object[][]{
                {215, true},
                {-215, false}
        };
    }


    // test for IsNegative
    @Test(dataProvider="testDataIsNegative")
    public void testIsNegative(long Number, Boolean expectedResult){
        Boolean result = calculator.isNegative(Number);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataIsNegative(){
        return new Object[][]{
                {215, false},
                {-215, true}
        };
    }

}
