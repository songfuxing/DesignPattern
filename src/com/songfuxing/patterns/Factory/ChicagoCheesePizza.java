package com.songfuxing.patterns.factory;

/**
 * 具体的产品
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "Chicago";
        dough = "Extra Thick Crust";
        sauce = "Plum Tomato";
        toppings.add("shredded mozzarella cheese");
    }
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
