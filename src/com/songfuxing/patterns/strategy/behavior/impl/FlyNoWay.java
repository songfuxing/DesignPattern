package com.songfuxing.patterns.strategy.behavior.impl;

import com.songfuxing.patterns.strategy.behavior.FlyBehavior;

/**
 * Created by songfuxing on 2018/6/20.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
