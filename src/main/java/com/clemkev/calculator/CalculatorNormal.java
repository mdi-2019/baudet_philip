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
    public Double exec(String cmd, Double ...params) {
        return null;
        //TODO: Switch
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
