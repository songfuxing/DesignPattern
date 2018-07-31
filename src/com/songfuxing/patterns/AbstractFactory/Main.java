package com.songfuxing.patterns.abstractFactory;

/**
 * 抽象工厂模式：用户创建依赖对象的家族，而不需要指明具体的类
 */
public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("sdd order a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("sfx ordered a " + pizza.getName());
    }
}
