package com.songfuxing.patterns.iterator.Composite.SampleComposite;

import java.util.Iterator;

/**
 * Created by songfuxing on 2018/8/14.
 */
public class NullIterator implements Iterator{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
