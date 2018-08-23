package com.songfuxing.patterns.complex.combination;

/**
 * 真正的工厂实现
 */
public class DuckFactory  extends  AbstractDuckFactory {
    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }
}
