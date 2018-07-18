package com.songfuxing.patterns.decorator;

/**
 * 抽象装饰者,所有装饰者都需要实现该类。
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
