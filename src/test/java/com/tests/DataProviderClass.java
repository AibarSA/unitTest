package com.tests;

import org.testng.annotations.DataProvider;

import static java.lang.Double.NaN;

public class DataProviderClass {

    @DataProvider
    public Object[][] testDataSumLong(){
        return new Object[][]{
                {500, 1000, 1500},
                {70, -100, -30},
                {-70, -100, -170}
        };
    }

    @DataProvider
    public Object[][] testDataSumDouble(){
        return new Object[][]{
                {5.5, 7.3, 12.8},
                {3.5, 4.5, 8.0},
        };

    }

    @DataProvider
    public Object[][] testDataSubLong(){
        return new Object[][]{
                {500, 1000, -500},
                {3500, 1000, 2500}
        };
    }

    @DataProvider
    public Object[][] testDataSubDouble(){
        return new Object[][]{
                {9.5, 7.3, 2.2},
                {12.5, 4.2, 8.3}
        };
    }

    @DataProvider
    public Object[][] testDataMultLong(){
        return new Object[][]{
                {500, 3, 1500},
                {350, 20, 7000}
        };
    }

    @DataProvider
    public Object[][] testDataMultDouble(){
        return new Object[][]{
                {5.2, 2.3, 11.96, 0.001},
                {12.5, 4.2, 52.5, 0.001}
        };
    }

    @DataProvider
    public Object[][] testDataDivLong(){
        return new Object[][]{
                {1500, 3, 500},
                {700, 20, 35}
        };
    }

    @DataProvider
    public Object[][] testDataDivDouble(){
        return new Object[][]{
                {12.2, 2.0, 6.1, 0.001},
                {12.5, 2.0, 6.25, 0.001},
        };
    }

    @DataProvider
    public Object[][] testDataPow(){
        return new Object[][]{
                {5.9, 5.9, 35320.50210071465, 0.001},
                {4.0, 2.0, 16.0, 0.001},
        };
    }

    @DataProvider
    public Object[][] testDataSqrt(){
        return new Object[][]{
                {144.0, 12.0, 0.001},
                {900.0, 30.0, 0.001},
                {-900.0, NaN, 0.001}
        };
    }

    @DataProvider
    public Object[][] testDataTg(){
        return new Object[][]{
                {1.5, 14.101419947171719, 0.001}
        };
    }

    @DataProvider
    public Object[][] testDataCtg(){
        return new Object[][]{
                {1.5, 0.07091484430265245, 0.001}
        };
    }

    @DataProvider
    public Object[][] testDataCos(){
        return new Object[][]{
                {2.5, -0.8011436155469337, 0.001}
        };
    }

    @DataProvider
    public Object[][] testDataSin(){
        return new Object[][]{
                {2.5, 0.5984721441039564, 0.001}
        };
    }

    @DataProvider
    public Object[][] testDataIsPositive(){
        return new Object[][]{
                {215, true},
                {-215, false}
        };
    }

    @DataProvider
    public Object[][] testDataIsNegative(){
        return new Object[][]{
                {215, false},
                {-215, true}
        };
    }
}
