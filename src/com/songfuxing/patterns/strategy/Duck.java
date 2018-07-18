package com.songfuxing.patterns.strategy;

import com.songfuxing.patterns.strategy.behavior.FlyBehavior;
import com.songfuxing.patterns.strategy.behavior.QuackBehavior;

/**
 * Created by songfuxing on 2018/6/20.
 */
public abstract class Duck {
    // 将经常变化的部分单独拿出来，进行封装
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack() {
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
