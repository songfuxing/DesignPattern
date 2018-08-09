package com.songfuxing.patterns.strategy;

import com.songfuxing.patterns.strategy.behavior.FlyBehavior;
import com.songfuxing.patterns.strategy.behavior.QuackBehavior;

/**
 * 策略模式：定义了算法族，把他们封装起来，让他们之间可以相互替代。 让算法的变化独立于算法的使用者
 */
public abstract class Duck {
    // 将经常变化的部分单独拿出来，进行封装
    // 这里定义了两个接口，用于封装两个变化的算法。
    // 使用组合的方式，"有一个"比"是一个"更好
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public void performFly(){
        // 委托给行为类
        flyBehavior.fly();
    }

    public void performQuack() {
        // 委托给行为类
        quackBehavior.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("All duck can swin");
    }

    /**
     * 动态设定行为
     */
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
