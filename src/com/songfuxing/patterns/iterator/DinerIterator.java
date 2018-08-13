package com.songfuxing.patterns.iterator;

import java.util.Iterator;

/**
 * 数组没有迭代器，需要自己实现
 * 迭代器模式：提供一种方法顺序访问一个聚合对象的各个元素，又不暴露元素的内部实现
 */
public class DinerIterator implements Iterator {
    MenuItems[] menus;
    int menuPos = 0;

    public DinerIterator(MenuItems[] menus) {
       this.menus = menus;
    }

    public boolean hasNext() {
        if (menuPos >= menus.length || menus[menuPos] == null) {
            return false;
        }
        return true;
    }

    public Object next() {
        return menus[menuPos++];
    }

    public void remove() {
        if (menuPos <= 0) {
            throw new IllegalStateException("can't remove an item from empty array");
        }
        if (menuPos == 1) {
            menuPos = 0;
            menus[0] = null;
            return;
        }
        for(int i = menuPos - 1; i < menus.length; i ++) {
            menus[i] = menus[i + 1];
        }
        menus[menus.length - 1] = null;
    }


}
