package com.songfuxing.patterns.iterator;

import java.util.Iterator;

/**
 * 统一菜单接口，简化使用；
 * 所有的菜单必须实现Iterator方法
 */
public interface Menu {
    public Iterator createIterator();
}
