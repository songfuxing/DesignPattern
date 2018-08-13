package com.songfuxing.patterns.iterator.SampleComposite;

/**
 * 组合模式：将对象组合成树形结构来表现"整体/部分"层次结构，让客户以一致的方式处理个别对象
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

        // 将dessert菜单也可以直接遍历打印出来=>"让客户以一致的方式处理个别对象"
        all.print();
    }
}
