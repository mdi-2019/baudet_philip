package com.clemkev.calculator;

import java.util.ArrayList;

public class CalculatorNormal extends Calculator {
    private ArrayList<String> commands;

    public CalculatorNormal() {
        super();
        commands = new ArrayList<String>();
        commands.add("add");
        commands.add("sub");
        commands.add("div");
        commands.add("mult");
    }

    @Override
    public void exec(String cmd, Double param) {
        switch (cmd) {
            case "add":
                add(this.getLastRes(), param);
                break;
            case "sub":
                sub(this.getLastRes(), param);
                break;
            case "div":
                div(this.getLastRes(), param);
                break;
            case "mult":
                mult(this.getLastRes(), param);
                break;
        }
    }

    private void add(Double param1, Double param2) {
        setLastRes(param1+param2);
    }

    private void sub(Double param1, Double param2) {
        setLastRes(param1-param2);
    }

    private void div(Double param1, Double param2) {
        setLastRes(param1/param2);
    }

    private void mult(Double param1, Double param2) {
        setLastRes(param1*param2);
    }

    @Override
    public Boolean isValid(String cmd) {
        return this.commands.contains(cmd);
    }

    @Override
    public String getCommands() {
        return commands.toString();
    }
}
