package com.songfuxing.patterns.decorator;

/**
 * 装饰者模式：动态的将责任附加到对象上，若要扩展功能，装饰者提供了比继承更有弹性的替代方案
 */
public class Main {
    public static void main(String[] args) {
        // 来一杯HouseBlend，不加饮料
        Beverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());

        // 来一杯HouseBlend，加mocha
        Beverage houseBlendMocha = new Mocha(new HouseBlend());
        System.out.println(houseBlendMocha.getDescription() + " $" + houseBlendMocha.cost());

        // 加mocha和whip
        Beverage houseWithMochaAndWhip = new HouseBlend();
        houseWithMochaAndWhip = new Mocha(houseWithMochaAndWhip);
        houseWithMochaAndWhip = new Whip(houseWithMochaAndWhip);
        System.out.println(houseWithMochaAndWhip.getDescription() + " $" + houseWithMochaAndWhip.cost());
    }
}
