package com.songfuxing.patterns.abstractFactory;

import com.songfuxing.patterns.abstractFactory.Ingredient.Cheese;
import com.songfuxing.patterns.abstractFactory.Ingredient.ChicagoCheese;
import com.songfuxing.patterns.abstractFactory.Ingredient.ChicagoDough;
import com.songfuxing.patterns.abstractFactory.Ingredient.ChicagoSouce;
import com.songfuxing.patterns.abstractFactory.Ingredient.Dough;
import com.songfuxing.patterns.abstractFactory.Ingredient.Souce;

/**
 * 原料工厂的具体实现，每个具体子类创建一个家族的产品，每种原料都是芝加哥的原料生产方式
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ChicagoDough();
    }

    @Override
    public Souce createSouce() {
        return new ChicagoSouce();
    }

    @Override
    public Cheese createCheese() {
        return new ChicagoCheese();
    }
}
