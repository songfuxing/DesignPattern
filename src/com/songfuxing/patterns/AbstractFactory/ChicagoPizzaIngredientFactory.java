package com.songfuxing.patterns.AbstractFactory;

import com.songfuxing.patterns.AbstractFactory.Ingredient.Cheese;
import com.songfuxing.patterns.AbstractFactory.Ingredient.ChicagoCheese;
import com.songfuxing.patterns.AbstractFactory.Ingredient.ChicagoDough;
import com.songfuxing.patterns.AbstractFactory.Ingredient.ChicagoSouce;
import com.songfuxing.patterns.AbstractFactory.Ingredient.Dough;
import com.songfuxing.patterns.AbstractFactory.Ingredient.NYCheese;
import com.songfuxing.patterns.AbstractFactory.Ingredient.NYDough;
import com.songfuxing.patterns.AbstractFactory.Ingredient.NYSouce;
import com.songfuxing.patterns.AbstractFactory.Ingredient.Souce;

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
