package com.songfuxing.patterns.strategy.behavior.impl;

import com.songfuxing.patterns.strategy.behavior.QuackBehavior;

/**
 * Created by songfuxing on 2018/6/20.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
