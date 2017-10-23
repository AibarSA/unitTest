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
        Object [][] obj = new Object[2][3];
        obj[0][0] = 500;
        obj[0][1] = 1000;
        obj[0][2] = 1500;

        obj[1][0] = 350;
        obj[1][1] = 1000;
        obj[1][2] = 1350;

        return obj;
    }


    // test for sum double
    @Test(dataProvider="testDataSumDouble")
    public void testSumDouble(double firstNumber, double secondNumber, double expectedResult){
        double result = calculator.sum(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataSumDouble(){
        Object [][] obj = new Object[2][3];
        obj[0][0] = 5.5;
        obj[0][1] = 7.3;
        obj[0][2] = 12.8;

        obj[1][0] = 3.5;
        obj[1][1] = 4.5;
        obj[1][2] = 8.0;

        return obj;
    }

    // test for sub long
    @Test(dataProvider="testDataSubLong")
    public void testSubLong(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataSubLong(){
        Object [][] obj = new Object[2][3];
        obj[0][0] = 500;
        obj[0][1] = 1000;
        obj[0][2] = -500;

        obj[1][0] = 3500;
        obj[1][1] = 1000;
        obj[1][2] = 2500;

        return obj;
    }


    // test for sub double
    @Test(dataProvider="testDataSubDouble")
    public void testSubDouble(double firstNumber, double secondNumber, double expectedResult){
        double result = calculator.sub(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataSubDouble(){
        Object [][] obj = new Object[2][3];
        obj[0][0] = 9.5;
        obj[0][1] = 7.3;
        obj[0][2] = 2.2;

        obj[1][0] = 12.5;
        obj[1][1] = 4.2;
        obj[1][2] = 8.3;

        return obj;
    }


    // test for mult long
    @Test(dataProvider="testDataMultLong")
    public void testMultLong(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataMultLong(){
        Object [][] obj = new Object[2][3];
        obj[0][0] = 500;
        obj[0][1] = 3;
        obj[0][2] = 1500;

        obj[1][0] = 350;
        obj[1][1] = 20;
        obj[1][2] = 7000;

        return obj;
    }


    // test for mult double
    @Test(dataProvider="testDataMultDouble")
    public void testMultDouble(double firstNumber, double secondNumber, double expectedResult, double delta){
        double result = calculator.mult(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataMultDouble(){
        Object [][] obj = new Object[2][4];
        obj[0][0] = 5.2;
        obj[0][1] = 2.3;
        obj[0][2] = 11.96;
        obj[0][3] = 0.001;

        obj[1][0] = 12.5;
        obj[1][1] = 4.2;
        obj[1][2] = 52.5;
        obj[1][3] = 0.001;

        return obj;
    }


    // test for div long
    @Test(dataProvider="testDataDivLong")
    public void testDivLong(long firstNumber, long secondNumber, long expectedResult){
        long result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataDivLong(){
        Object [][] obj = new Object[2][3];
        obj[0][0] = 1500;
        obj[0][1] = 3;
        obj[0][2] = 500;

        obj[1][0] = 700;
        obj[1][1] = 20;
        obj[1][2] = 35;

        return obj;
    }


    // test for div double
    @Test(dataProvider="testDataDivDouble")
    public void testDivDouble(double firstNumber, double secondNumber, double expectedResult, double delta){
        double result = calculator.div(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataDivDouble(){
        Object [][] obj = new Object[2][4];
        obj[0][0] = 12.2;
        obj[0][1] = 2.0;
        obj[0][2] = 6.1;
        obj[0][3] = 0.001;

        obj[1][0] = 12.5;
        obj[1][1] = 2.0;
        obj[1][2] = 6.25;
        obj[1][3] = 0.001;

        return obj;
    }


    // test for pow
    @Test(dataProvider="testDataPow")
    public void testPow(double firstNumber, double secondNumber, double expectedResult, double delta){
        double result = calculator.pow(firstNumber, secondNumber);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataPow(){
        Object [][] obj = new Object[2][4];
        obj[0][0] = 3.0;
        obj[0][1] = 3.0;
        obj[0][2] = 27.0;
        obj[0][3] = 0.001;

        obj[1][0] = 4.0;
        obj[1][1] = 2.0;
        obj[1][2] = 16.0;
        obj[1][3] = 0.001;

        return obj;
    }


    // test for sqrt
    @Test(dataProvider="testDataSqrt")
    public void testSqrt(double Number, double expectedResult, double delta){
        double result = calculator.sqrt(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataSqrt(){
        Object [][] obj = new Object[2][3];
        obj[0][0] = 144.0;
        obj[0][1] = 12.0;
        obj[0][2] = 0.001;

        obj[1][0] = 900.0;
        obj[1][1] = 30.0;
        obj[1][2] = 0.001;

        return obj;
    }


    // test for tg
    @Test(dataProvider="testDataTg")
    public void testTg(double Number, double expectedResult, double delta){
        double result = calculator.tg(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataTg(){
        Object [][] obj = new Object[1][3];
        obj[0][0] = 1.5;
        obj[0][1] = 14.101419947171719;
        obj[0][2] = 0.001;

        return obj;
    }


    // test for ctg
    @Test(dataProvider="testDataCtg")
    public void testCtg(double Number, double expectedResult, double delta){
        double result = calculator.ctg(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataCtg(){
        Object [][] obj = new Object[1][3];
        obj[0][0] = 1.5;
        obj[0][1] = 0.07091484430265245;
        obj[0][2] = 0.001;

        return obj;
    }

    // test for cos
    @Test(dataProvider="testDataCos")
    public void testCos(double Number, double expectedResult, double delta){
        double result = calculator.cos(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataCos(){
        Object [][] obj = new Object[1][3];
        obj[0][0] = 2.5;
        obj[0][1] = -0.8011436155469337;
        obj[0][2] = 0.001;

        return obj;
    }


    // test for sin
    @Test(dataProvider="testDataSin")
    public void testSin(double Number, double expectedResult, double delta){
        double result = calculator.sin(Number);
        Assert.assertEquals(result,expectedResult, delta);
    }

    @DataProvider
    public Object[][] testDataSin(){
        Object [][] obj = new Object[1][3];
        obj[0][0] = 2.5;
        obj[0][1] = 0.5984721441039564;
        obj[0][2] = 0.001;

        return obj;
    }


    // test for isPositive
    @Test(dataProvider="testDataIsPositive")
    public void testIsPositive(long Number, Boolean expectedResult){
        Boolean result = calculator.isPositive(Number);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataIsPositive(){
        Object [][] obj = new Object[2][2];
        obj[0][0] = 215;
        obj[0][1] = true;

        obj[1][0] = -215;
        obj[1][1] = false;

        return obj;
    }


    // test for IsNegative
    @Test(dataProvider="testDataIsNegative")
    public void testIsNegative(long Number, Boolean expectedResult){
        Boolean result = calculator.isNegative(Number);
        Assert.assertEquals(result,expectedResult);
    }

    @DataProvider
    public Object[][] testDataIsNegative(){
        Object [][] obj = new Object[2][2];
        obj[0][0] = 215;
        obj[0][1] = false;

        obj[1][0] = -215;
        obj[1][1] = true;

        return obj;
    }

}
