package com.songfuxing.patterns.decorator;

/**
 * 装饰者
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.23 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}
