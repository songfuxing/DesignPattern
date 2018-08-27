package com.songfuxing.patterns.complex.combination;

import java.util.ArrayList;

/**
 * 鸭子组合，包含组合和叶子节点两种类型的元素，对客户透明
 */
public class Flock implements Quackable {
    ArrayList<Quackable> quackers = new ArrayList();

    ObservableProxy proxy;

    public Flock() {
        this.proxy = new ObservableProxy(this);
    }

    public void add(Quackable quackable) {
        quackers.add(quackable);
    }

    public void quack() {
        for (Quackable quacker: quackers) {
            quacker.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker: quackers) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }
}
