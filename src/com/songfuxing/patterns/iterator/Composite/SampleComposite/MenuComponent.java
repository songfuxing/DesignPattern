package com.songfuxing.patterns.iterator.Composite.SampleComposite;

import java.util.Iterator;

/**
 * 组件是叶节点和组合节点的"超集"
 * 组件自己提供了默认的方法，因此允许叶节点和组合只实现他们想实现的方法，而不用全部实现
 */
public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public void print() {
        throw new UnsupportedOperationException();
    }

    public Iterator createIterator(){
        throw new UnsupportedOperationException();
    }
}
