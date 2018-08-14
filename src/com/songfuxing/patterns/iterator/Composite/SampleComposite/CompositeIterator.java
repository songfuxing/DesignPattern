package com.songfuxing.patterns.iterator.Composite.SampleComposite;

import java.util.Iterator;
import java.util.Stack;

/**
 * 组合的遍历方法
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        }
        Iterator iterator = (Iterator) stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            MenuComponent menuComponent = (MenuComponent) iterator.next();
            // 如果元素是菜单，则我们有了另一个需要遍历对迭代对象，将其加入stack中
            if (menuComponent instanceof Menu) {
                stack.push(menuComponent.createIterator());
            }
            // 无论是菜单还是菜单项，都直接返回
            return menuComponent;
        } else {
            return null;
        }

    }

}
