package com.songfuxing.patterns.template.Hook;

/**
 * 子类，实现算法
 */
public class Tea extends CaffeineBeverage {
    public void brew(){
        System.out.println("Steeping the tea");
    }

    public void addCondiments(){
        System.out.println("Adding Lemon");
    }
}
