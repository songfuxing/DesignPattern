package com.songfuxing.patterns.Factory;

/**
 * 创建者类，它定义来一个抽象工厂方法(createPizza),让子类实现此方法制造产品。
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        // 把创建pizza的任务委托给工厂，这样就不用自己new出各种各样的具体实例。
        // 如果自己new各种piza实例，则pizza店就会有很多的依赖
        // 依赖倒置原则：依赖抽象，不依赖具体类。 减少对具体类的依赖
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 1、工厂方法是抽象的，所以依赖于子类来处理对象的创建
     * 2、工厂方法必须返回一个产品
     * 3、工厂方法将客户pizzaStore和实际创建具体产品的代码分隔开
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
