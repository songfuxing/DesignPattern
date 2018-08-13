package com.songfuxing.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by songfuxing on 2018/8/10.
 */
public class BreakfastMenu implements Menu {
    ArrayList menuItems;
    public BreakfastMenu() {
        menuItems = new ArrayList();
        addItem("KB", "Pancake with eggs", true, 12);
        addItem("ddB", "Pancake with beaf", false, 22);
        addItem("BBQ", "beaf and sausage", false, 232);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItems menu = new MenuItems(name, description, vegetarian, price);
        menuItems.add(menu);
    }

    // 封装需要遍历的部分，对外屏蔽实现
    public Iterator createIterator() {
        // 不自己创建了，使用java arraylist的迭代器
        return menuItems.iterator();
        // return new BreakfastIterator(menuItems);
    }

    // 这个方法暴露了内部的实现，如果要遍历菜单，则依赖于菜单的数据结构，非常难以维护
    public ArrayList getMenuItems() {
        return menuItems;
    }

}
