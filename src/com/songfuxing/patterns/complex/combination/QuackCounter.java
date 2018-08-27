package com.songfuxing.patterns.complex.combination;

/**
 * 装饰器模式
 * 包装Quackable, 统计quack调用的次数
 */
public class QuackCounter implements Quackable {
    static int count;
    Quackable duck;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        count ++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
