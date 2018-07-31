package com.songfuxing.patterns.abstractFactory;

import java.util.ArrayList;

import com.songfuxing.patterns.abstractFactory.Ingredient.Cheese;
import com.songfuxing.patterns.abstractFactory.Ingredient.Dough;
import com.songfuxing.patterns.abstractFactory.Ingredient.Souce;

/**
 * 工厂生产的产品
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Souce souce;
    Cheese cheese;
    ArrayList toppings = new ArrayList();

    // 在这个方法中，我们需要收集原料
    abstract void prepare() ;


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
