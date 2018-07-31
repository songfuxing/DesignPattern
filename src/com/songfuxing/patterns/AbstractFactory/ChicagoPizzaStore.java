package com.songfuxing.patterns.abstractFactory;


/**
 *
 */
public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if (item.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        } else  {
            return null;
        }
    }
}
