package com.clemkev.calculator;

import java.util.ArrayList;
import java.lang.Math;

public class CalculatorScientifique extends Calculator {
    private ArrayList<String> commands;

    public CalculatorScientifique() {
        super();
        commands = new ArrayList<String>();
        commands.add("sqrt");
        commands.add("sin");
        commands.add("cos");
        commands.add("tan");
    }

    @Override
    public void exec(String cmd, Double param) {
        double res=0;
        switch (cmd) {
            case "sqrt":
                res = sqrt();
                break;
            case "sin":
                res = sin();
                break;
            case "cos":
                res = cos();
                break;
            case "tan":
                res = tan();
                break;
        }
        setLastRes(res);

    }

    @Override
    public Boolean isValid(String cmd) {
        return this.commands.contains(cmd);
    }

    @Override
    public String getCommands() {
        return commands.toString();
    }

    public double sqrt(){
        return Math.sqrt(getLastRes());
    }

    public double sin(){
        return Math.sin(getLastRes());
    }

    public double cos(){
        return Math.cos(getLastRes());
    }

    public double tan(){
        return Math.tan(getLastRes());
    }
}
