package com.songfuxing.patterns.Singleton;

/**
 * 多线程时，初始化时多个线程同时进入getInstance方法，会生成多个实例.
 */
public class Multithreading {
    private Multithreading(){};
    private static Multithreading simpleSingleton;
    // 保证这个方法的同步调用
    public static synchronized Multithreading getInstance() {
        if (simpleSingleton == null) {
            simpleSingleton = new Multithreading();
        }
        return simpleSingleton;
    }
}
