package com.songfuxing.patterns.iterator.Composite.SampleComposite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 组合节点, 添加createIterator方法，遍历组合
 */
public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    // 添加createIterator方法，遍历组合
    // 向外部暴露Iterator方法
    public Iterator createIterator() {
        return new CompositeIterator(menuComponents.iterator());
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
    // 在这里，菜单是整体，菜单项是部分，我们用一致的方法处理了整体/部分，"menuComponent.print();"，而不用管整体/部分的具体实现。
    // 这里是在内部处理Iterator方法
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
