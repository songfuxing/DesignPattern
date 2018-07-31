package com.songfuxing.patterns.Singleton;

/**
 * Mutithreading的问题在于：如果getInstance频繁被调用，那么这个方法就会非常耗时。而且synchronized的意义在于第一次进入方法时保证单例对象正确创建，没有必要
 * 在初始化之后，每次都加锁。
 */
public class TwoLock {
    private TwoLock(){};
    // volatile保证多线程的读取真实值，而非缓存
    private volatile static TwoLock simpleSingleton;
    // 保证这个方法的同步调用
    public static  TwoLock getInstance() {
        if (simpleSingleton == null) {
            synchronized(TwoLock.class) {
                // 再次检测，原因是synchronized会形成同步队列，同步队列中的下一个线程可能不知道前一个进程已经创建了simpliesingleton
                // 对象，因此需要再次检测；
                if (simpleSingleton == null) {
                    simpleSingleton = new TwoLock();
                }
            }
        }
        return simpleSingleton;
    }
}
