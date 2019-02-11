package com.clemkev.calculator;

import java.util.ArrayList;

public class CalculatorScientifique extends Calculator {
    private ArrayList<String> commands;

    public CalculatorScientifique() {
        super();
        commands = new ArrayList<String>();
    }

    @Override
    public void exec(String cmd, Double params) {
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
