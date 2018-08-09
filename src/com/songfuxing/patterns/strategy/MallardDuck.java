package com.songfuxing.patterns.strategy;

import com.songfuxing.patterns.strategy.behavior.impl.FlyWithWings;
import com.songfuxing.patterns.strategy.behavior.impl.Quack;

/**
 *
 * 子类选择使用合适的算法
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        // 初始化绑定行为
        // 赋予它可以飞行的能力
        flyBehavior = new FlyWithWings();
        // 赋予它可以叫的能力
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a Mallard Duck");
    }
}
