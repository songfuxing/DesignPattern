package com.songfuxing.patterns.order;

/**
 * 接收者
 */
public class Door {
    private String name;
    public Door(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println(name + " door on");
    }
    public void off() {
        System.out.println(name + " door off");
    }
}
