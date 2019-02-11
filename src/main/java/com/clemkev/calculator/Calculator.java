package com.clemkev.calculator;


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

    public abstract void exec(String cmd, Double param);

    public abstract String getCommands();
}
