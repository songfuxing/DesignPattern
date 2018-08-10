package com.songfuxing.patterns.iterator;

import java.util.ArrayList;

/**
 * Created by songfuxing on 2018/8/10.
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
