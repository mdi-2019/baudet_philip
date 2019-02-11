package com.clemkev.calculator;

import java.util.ArrayList;

public class CalculatorScientifique extends Calculator {
    private ArrayList<String> commands;

    public CalculatorScientifique() {
        super();
        commands = new ArrayList<String>();
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
