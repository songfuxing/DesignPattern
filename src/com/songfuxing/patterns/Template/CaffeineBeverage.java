package com.songfuxing.patterns.Template;

/**
 * Created by songfuxing on 2018/8/9.
 */
public abstract class CaffeineBeverage {
    // 这是我们的模版方法,申明为final防止子类覆盖，关注流程，把算法的具体实现申明为抽象，在子类中实现。
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    // 这些方法是子类必须提供的
    abstract void brew();
    abstract void addCondiments();
    // 这些方法是超类处理的，所有子类共享，也可以覆盖
    void boilWater() {
        System.out.println("Bolling water");
    }
    void pourInCup() {
        System.out.println("Pouring into Cups");
    }
}
