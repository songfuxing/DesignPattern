package com.songfuxing.patterns.decorator;

/**
 * component的具体组件,可以被装饰着包起来
 */
public class HouseBlend extends Beverage {
    public double cost() {
        return 1.2;
    }

    HouseBlend() {
       description = "HousBlend";
    }
}
