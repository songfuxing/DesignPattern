package com.songfuxing.patterns.singleton;

/**
 * Created by songfuxing on 2018/7/31.
 */
public class SimpleSingleton {
    // 构造器私有，只有自己可以调用
    private SimpleSingleton(){};
    private static SimpleSingleton simpleSingleton;
    // 使用时才加载
    public static SimpleSingleton getInstance() {
        if (simpleSingleton == null) {
            simpleSingleton = new SimpleSingleton();
        }
        return simpleSingleton;
    }
}
