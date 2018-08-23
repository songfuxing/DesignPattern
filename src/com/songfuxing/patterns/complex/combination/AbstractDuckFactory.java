package com.songfuxing.patterns.complex.combination;

/**
 * 抽象工厂模式
 * 生产duck的集合
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createDuckCall();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createMallardDuck();
}
