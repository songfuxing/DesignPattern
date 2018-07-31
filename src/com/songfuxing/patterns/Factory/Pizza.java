package com.songfuxing.patterns.factory;

import java.util.ArrayList;

/**
 * 工厂生产的产品
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("   " + toppings.get(i));
        }
    }

    void bake() {
        System.out.println(" Bake for 25 minutes");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal");
    }

    void box() {
        System.out.println("cut");
    }

    public String getName(){
        return name;
    }

}
