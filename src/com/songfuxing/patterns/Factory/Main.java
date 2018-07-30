package com.songfuxing.patterns.Factory;

/**
 * 定义了一个创建对象的接口，但由于子类决定要实例化哪一个类，工厂方法让类把实例化推迟到子类。
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
