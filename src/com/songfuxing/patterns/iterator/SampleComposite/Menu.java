package com.songfuxing.patterns.iterator.SampleComposite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合节点
 */
public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();;
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // 菜单和菜单相都可以加入菜单，因为都是MenuComponent
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // 如果iterator.next()是菜单项，则直接调用MenuItem的print方法，直接打印菜单项
    // 如果是菜单，则调用Menu的print方法，继续迭代
    public void print() {
        System.out.println("This is Menu:" + getName());
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()) {
            System.out.print("    ");
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }

}
