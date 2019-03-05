package com.clemkev.calculator;


abstract public class Calculator {
    private Double lastRes;

    public Calculator() {
        this.lastRes = 0.0;
    }

    /**
     * @return Last value calculated
     */
    public Double getLastRes() {
        return lastRes;
    }

    /**
     * @param lastRes Set the last value calculated
     */
    public void setLastRes(Double lastRes) {
        this.lastRes = lastRes;
    }

    /**
     * @param cmd
     * @return The commands list contains cmd
     */
    public abstract Boolean isValid(String cmd);

    /**
     * Execute the command cmd with param as parameter
     * @param cmd
     * @param param
     */
    public abstract void exec(String cmd, Double param);

    /**
     * Return the list of commands
     * @return
     */
    public abstract String getCommands();
}
