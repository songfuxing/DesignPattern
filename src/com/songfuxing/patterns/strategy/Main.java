package com.songfuxing.patterns.strategy;

import com.songfuxing.patterns.strategy.behavior.impl.FlyNoWay;

/**
 * Created by songfuxing on 2018/6/20.
 */
public class Main {
    public static void main(String[] args) {
        Duck mallarduck = new MallardDuck();
        mallarduck.display();
        mallarduck.performFly();
        mallarduck.performQuack();

        // 虽然我们在mallarduck的构造函数中加入了具体实现，但是在这里可以动态的改变。
        mallarduck.setFlyBehavior(new FlyNoWay());
        mallarduck.performFly();
    }
}
