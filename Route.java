package com.Sylhet;

public class Route {
    private Place starting;
    private Place ending;
    private double cngCost;
    private double rickshawCost;

    public Route(Place starting, Place ending, double cngCost, double rickshawCost) {
        this.starting = starting;
        this.ending = ending;
        this.cngCost = cngCost;
        this.rickshawCost = rickshawCost;
    }

    public Place getStarting() {
        return starting;
    }

    public void setStarting(Place starting) {
        this.starting = starting;
    }

    public Place getEnding() {
        return ending;
    }

    public void setEnding(Place ending) {
        this.ending = ending;
    }

    public double getCngCost() {
        return cngCost;
    }

    public void setCngCost(double cngCost) {
        this.cngCost = cngCost;
    }

    public double getRickshawCost() {
        return rickshawCost;
    }

    public void setRickshawCost(double rickshawCost) {
        this.rickshawCost = rickshawCost;
    }
}
