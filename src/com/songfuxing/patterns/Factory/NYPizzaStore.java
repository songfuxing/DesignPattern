package com.songfuxing.patterns.Factory;

/**
 * 具体子类负责pizza创建
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYCheesePizza();
        } else  {
            return null;
        }
    }
}
