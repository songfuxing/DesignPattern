package com.songfuxing.patterns.decorator;

/**
 * component
 */
public abstract  class Beverage {
    public String description;

    public String getDescription() {
        return description;
    }
    abstract public double cost();
}
