package com.songfuxing.patterns.iterator.Composite.SampleComposite;

import java.util.Iterator;

/**
 * 对组合进行遍历
 */
public class Main {
    public static void main(String[] args) {
        MenuComponent breakfastMenu = new Menu("Breakfast Menu", "Breakfast");
        MenuComponent dinerMenu= new Menu("Diner Menu", "Diner");
        MenuComponent lunchMenu= new Menu("Lunch Menu", "Lunch");
        MenuComponent dessertMenu= new Menu("Dessert Menu", "Dessert");
        MenuComponent all = new Menu("All Menu" ,"All");
        all.add(breakfastMenu);
        all.add(dinerMenu);
        all.add(lunchMenu);

        dinerMenu.add(new MenuItem("Pasta", "Spaghetti with Sauce",true, 12));
        dessertMenu.add(new MenuItem("Apple Pie", "with flakey crusht", true, 123));
        // dessert菜单是在diner菜单中的一个组合
        dinerMenu.add(dessertMenu);

        // 对组合对遍历
        // 只打印出蔬菜
        Iterator iterator = all.createIterator();
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch(UnsupportedOperationException e) {
                // 忽略菜单
                }
        }
    }
}
