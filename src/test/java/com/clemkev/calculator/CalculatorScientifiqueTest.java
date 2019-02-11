package com.clemkev.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorScientifiqueTest {
    Calculator calc;

    @Before
    public void setUp(){
        calc = new CalculatorScientifique();

    }


    @Test
    public void Testsqrt(){
        calc.setLastRes(4.0);
        calc.exec("sqrt", 4.0);
        Assert.assertEquals(2.0, calc.getLastRes(), 0.001);
    }

    @Test
    public void Testcos(){
        calc.setLastRes(4.0);
        calc.exec("cos", 0.0);
        Assert.assertEquals(Math.cos(4.0), calc.getLastRes(), 0.001);
    }

    @Test
    public void Testsin(){
        calc.setLastRes(4.0);
        calc.exec("sin", 4.0);
        Assert.assertEquals(Math.sin(4.0), calc.getLastRes(), 0.001);
    }

    @Test
    public void Testtan(){
        calc.setLastRes(4.0);
        calc.exec("tan", 4.0);
        Assert.assertEquals(Math.tan(4.0), calc.getLastRes(), 0.001);
    }

}
