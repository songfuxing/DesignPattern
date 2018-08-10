package com.songfuxing.patterns.iterator;

/**
 * Created by songfuxing on 2018/8/10.
 */
public class MenuItems {
    String name;
    String description;
    boolean vegetarian;

    double price;

    public MenuItems(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}

