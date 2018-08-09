package com.songfuxing.patterns.template;

/**
 * 子类，实现算法
 */
public class Coffee extends CaffeineBeverage{
    public void brew() {
        System.out.println("Coffee");
    }
    public void addCondiments() {
        System.out.println("Adding Sugar");
    }
}
