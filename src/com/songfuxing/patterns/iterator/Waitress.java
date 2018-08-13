package com.songfuxing.patterns.iterator;

import java.util.Iterator;

/**
 * 女招待，给客人点餐，需要遍历菜单
 */
public class Waitress {
    // 菜单类统一使用Menu接口，简化女招待调用
    Menu breakfastMenu;
    Menu dinerMenu;

    public Waitress(Menu breakfastMenu, Menu dinerMenu){
        this.breakfastMenu = breakfastMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator breakfastIterator = breakfastMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        print(breakfastIterator);
        print(dinerIterator);
    }

    // Iterator 迭代器可以使女招待从不同的类的实现中解耦，对所有的类使用同样的遍历方式。
    private void print(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItems menu = (MenuItems)iterator.next();
            System.out.println(menu.getDescription());
            System.out.println(menu.getName());
            System.out.println(menu.getPrice());
            System.out.println(menu.isVegetarian());
        }
    }
}
