package com.songfuxing.patterns.strategy.behavior.impl;

import com.songfuxing.patterns.strategy.behavior.FlyBehavior;

/**
 * Created by songfuxing on 2018/6/20.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
