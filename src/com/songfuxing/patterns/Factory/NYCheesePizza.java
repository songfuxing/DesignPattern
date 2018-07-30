package com.songfuxing.patterns.Factory;

/**
 * 具体的产品
 */
public class NYCheesePizza extends Pizza{
    public NYCheesePizza() {
        name = "NY Cheess Pizza";
        dough = "Thin Crust";
        sauce = "Marinara";
        toppings.add("Grated Reggiano Cheese");
    }
}
