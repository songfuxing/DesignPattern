package com.songfuxing.patterns.iterator;

import java.util.ArrayList;

/**
 * Created by songfuxing on 2018/8/10.
 */
public class BreakfastMenu {
    ArrayList menuItems;
    public BreakfastMenu() {
        menuItems = new ArrayList();
        addItem("KB", )
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        Menu menu = new Menu(name, description, vegetarian, price);
        menuItems.add(menu);
    }

}
