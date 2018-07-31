package com.songfuxing.patterns.abstractFactory;

import com.songfuxing.patterns.abstractFactory.Ingredient.Cheese;
import com.songfuxing.patterns.abstractFactory.Ingredient.Dough;
import com.songfuxing.patterns.abstractFactory.Ingredient.NYCheese;
import com.songfuxing.patterns.abstractFactory.Ingredient.NYDough;
import com.songfuxing.patterns.abstractFactory.Ingredient.NYSouce;
import com.songfuxing.patterns.abstractFactory.Ingredient.Souce;

/**
 * 原料工厂的具体实现，每个具体子类创建一个家族的产品，每种原料都是纽约的原料生产方式
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Souce createSouce() {
        return new NYSouce();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }
}
