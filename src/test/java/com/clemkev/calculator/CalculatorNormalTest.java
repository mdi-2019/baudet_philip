package com.clemkev.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorNormalTest {
    private Calculator calc;

    @Before
    public void setUp() {
        this.calc = new CalculatorNormal();
    }

    @Test
    public void testAddition() {
        calc.exec("add", 4.0);
        Assert.assertEquals(4.0, calc.getLastRes(), 0.001);
        calc.exec("add", 4.0);
        Assert.assertEquals(8.0, calc.getLastRes(), 0.001);
    }

    @Test
    public void testMultiplication() {
        calc.exec("add", 5.0);
        calc.exec("mult", 5.0);
        Assert.assertEquals(25.0, calc.getLastRes(), 0.001);
        calc.exec("mult", 4.0);
        Assert.assertEquals(100.0, calc.getLastRes(), 0.001);
    }

    @Test
    public void testDivision() {
        calc.exec("add", 100.0);
        calc.exec("div", 10.0);
        Assert.assertEquals(10.0, calc.getLastRes(), 0.001);
        calc.exec("div", 10.0);
        Assert.assertEquals(1.0, calc.getLastRes(), 0.001);
    }

    @Test
    public void testSoustraction() {
        calc.exec("add", 100.0);
        calc.exec("sub", 50.0);
        Assert.assertEquals(50.0, calc.getLastRes(), 0.001);
        calc.exec("sub", 10.0);
        Assert.assertEquals(40.0, calc.getLastRes(), 0.001);
    }
}
