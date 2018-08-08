package com.songfuxing.patterns.Adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 旧接口Enumeration有两个方法，hasMoreElements() nextElements()
 * 新接口有三个方法，hasNext() next() remove()
 * 该适配器将旧接口适配到新接口上
 */
public class EnumerationAdapter implements Iterator {

    Enumeration enumeration;

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        // 旧接口Enumeration没有remove方法
        throw new UnsupportedOperationException();

    }
}
