package com.songfuxing.patterns.abstractFactory;

import com.songfuxing.patterns.abstractFactory.Ingredient.Cheese;
import com.songfuxing.patterns.abstractFactory.Ingredient.Dough;
import com.songfuxing.patterns.abstractFactory.Ingredient.Souce;

/**
 * 抽象工厂接口，定义了这个家族生产产品的方式和产品
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Souce createSouce();
    public Cheese createCheese();

}
