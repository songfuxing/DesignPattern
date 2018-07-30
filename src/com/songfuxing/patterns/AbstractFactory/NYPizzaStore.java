package com.songfuxing.patterns.AbstractFactory;

/**
 * 具体子类负责pizza创建
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            return new CheesePizza(pizzaIngredientFactory);
        } else  {
            return null;
        }
    }
}
