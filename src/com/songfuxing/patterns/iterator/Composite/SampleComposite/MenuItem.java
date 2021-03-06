package com.songfuxing.patterns.iterator.Composite.SampleComposite;

import java.util.Iterator;

/**
 * 叶子节点：菜单项,添加createIterator方法，遍历组合
 */
public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name, String description, boolean vegetarian, double price){
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    // 添加createIterator方法，遍历组合
    public Iterator createIterator() {
        return new NullIterator();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print() {
        System.out.println("    This is MenuItem: " + getName());
        System.out.println("    price:" + getPrice());
    }
}
