package com.songfuxing.patterns.iterator;

import java.util.Iterator;

/**
 * Created by songfuxing on 2018/8/10.
 */
public class DinerMenu implements Menu{
    static final int MAX_MENU_ITEMS = 10;
    int numberOfItems = 0;
    MenuItems[] menus;

    public DinerMenu() {
        menus = new MenuItems[MAX_MENU_ITEMS];

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_MENU_ITEMS) {
            System.err.println("Sorry, menu is full!");
        }
        MenuItems menu = new MenuItems(name, description, vegetarian, price);
        menus[numberOfItems] = menu;
        numberOfItems ++;
    }

    // 封装需要遍历的部分，对外屏蔽实现
    public Iterator createIterator() {
        return new DinerIterator(menus);
    }

    // 这个方法暴露了内部的实现，如果要遍历菜单，则依赖于菜单的数据结构，非常难以维护
    public MenuItems[] getMenus() {
        return menus;
    }
}
