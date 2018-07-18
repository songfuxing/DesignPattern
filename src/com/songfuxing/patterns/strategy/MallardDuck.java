package com.songfuxing.patterns.strategy;

import com.songfuxing.patterns.strategy.behavior.impl.FlyWithWings;
import com.songfuxing.patterns.strategy.behavior.impl.Quack;

/**
 * Created by songfuxing on 2018/6/20.
 */
public class MallardDuck extends Duck{

    public MallardDuck(){
        // 初始化绑定行为
        // todo: 不要对具体实现编程，而是要对接口编程
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a Mallard Duck");
    }
}
