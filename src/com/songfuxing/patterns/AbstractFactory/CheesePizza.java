package com.songfuxing.patterns.abstractFactory;

/**
 * 具体的产品
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
     this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Prepare:" + name) ;
        dough = ingredientFactory.createDough();
        souce = ingredientFactory.createSouce();
        cheese = ingredientFactory.createCheese();
    }
}
