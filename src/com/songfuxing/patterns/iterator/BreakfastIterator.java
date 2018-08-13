package com.songfuxing.patterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 被java的Iterator取代
 * 迭代器模式：提供一种方法顺序访问一个聚合对象的各个元素，又不暴露元素的内部实现
 */
public class BreakfastIterator implements Iterator {
    int menuPos = 0;
    ArrayList menus;

    public BreakfastIterator(ArrayList menus) {
        this.menus = menus;
    }

    public Object next(){
        return menus.get(menuPos++);
    }

    public boolean hasNext() {
        if (menuPos >= menus.size()) {
            return false;
        }
        return true;
    }
}
