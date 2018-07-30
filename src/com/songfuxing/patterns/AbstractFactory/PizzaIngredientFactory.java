package com.songfuxing.patterns.AbstractFactory;

import com.songfuxing.patterns.AbstractFactory.Ingredient.Cheese;
import com.songfuxing.patterns.AbstractFactory.Ingredient.Dough;
import com.songfuxing.patterns.AbstractFactory.Ingredient.Souce;

/**
 * 抽象工厂接口，定义了这个家族生产产品的方式和产品
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Souce createSouce();
    public Cheese createCheese();

}
