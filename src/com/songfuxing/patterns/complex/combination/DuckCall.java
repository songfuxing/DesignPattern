package com.songfuxing.patterns.complex.combination;

/**
 * 一种鸭叫器
 */
public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("duck call: Kwak");
    }
}
