package com.songfuxing.patterns.strategy.behavior.impl;

import com.songfuxing.patterns.strategy.behavior.QuackBehavior;

/**
 * Created by songfuxing on 2018/6/20.
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Slience >>");
    }
}
