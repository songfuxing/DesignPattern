package com.songfuxing.patterns.decorator;

/**
 * 装饰者,包含了一个装饰器组件.用来增强装饰器组件的功能。
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return 0.34 + beverage.cost();
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

}
