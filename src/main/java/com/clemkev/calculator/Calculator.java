package com.clemkev.calculator;

import java.util.ArrayList;

abstract public class Calculator {
    private Double lastRes;

    public Calculator() {
        this.lastRes = 0.0;
    }

    public Double getLastRes() {
        return lastRes;
    }

    public void setLastRes(Double lastRes) {
        this.lastRes = lastRes;
    }

    public abstract Boolean isValid(String cmd);

    public abstract void exec(String cmd, Double params);

    public abstract String getCommands();
}
