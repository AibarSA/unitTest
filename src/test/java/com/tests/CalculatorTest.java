package com.tests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;



public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testSumLong(){
        long result = calculator.sum(500,1000);
        Assert.assertEquals(result,1500);
    }

    @Test
    public void testSumDouble(){
        Double result = calculator.sum(5.5,7.3);
        Assert.assertEquals(result,12.8);
    }

    @Test
    public void testSubLong(){
        long result = calculator.sub(500,1000);
        Assert.assertEquals(result,-500);
    }

    @Test
    public void testSubDouble(){
        Double result = calculator.sub(9.5,7.3);
        Assert.assertEquals(result,2.2);
    }

    @Test
    public void testMultLong(){
        long result = calculator.mult(500,5);
        Assert.assertEquals(result,2500);
    }

    @Test
    public void testMultDouble(){
        Double result = calculator.mult(5.2,2.0);
        Assert.assertEquals(result,10.4,0.001);
    }

    @Test
    public void testDivLong(){
        long result = calculator.div(500,250);
        Assert.assertEquals(result,2);
    }

    @Test
    public void testDivDouble(){
        Double result = calculator.div(9.0,2.0);
        Assert.assertEquals(result,4.5,0.001);
    }

    @Test
    public void testPow(){
        Double result = calculator.pow(3.0,3.0);
        Assert.assertEquals(result,27.0,0.001);
    }

    @Test
    public void testSqrt(){
        Double result = calculator.sqrt(144.0);
        Assert.assertEquals(result,12.0,0.001);
    }

    @Test
    public void testTg(){
        Double result = calculator.tg(1.5);
        Assert.assertEquals(result,14.101419947171719,0.001);
    }

    @Test
    public void testCtg(){
        Double result = calculator.ctg(1.5);
        Assert.assertEquals(result,0.07091484430265245,0.001);
    }

    @Test
    public void testCos(){
        Double result = calculator.cos(2.5);
        Assert.assertEquals(result,-0.8011436155469337,0.001);
    }

    @Test
    public void testSin(){
        Double result = calculator.sin(2.5);
        Assert.assertEquals(result,0.5984721441039564,0.001);
    }

    @Test
    public void testIsPositive(){
        Boolean result = calculator.isPositive(215);
        Assert.assertEquals(result,(Boolean) true);
    }

    @Test
    public void testIsNegative(){
        Boolean result = calculator.isNegative(-215);
        Assert.assertEquals(result,(Boolean) true);
    }
}
