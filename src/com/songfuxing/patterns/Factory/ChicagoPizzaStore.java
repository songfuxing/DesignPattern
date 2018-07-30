package com.songfuxing.patterns.Factory;

/**
 * 具体子类负责实现pizza创建
 */
public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoCheesePizza();
        } else  {
            return null;
        }
    }
}
