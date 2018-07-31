package com.songfuxing.patterns.order;

/**
 * Created by songfuxing on 2018/7/31.
 */
public class NoCommand implements Command{
    String name;

    public NoCommand() {
        this.name = "No Command";
    }
    @Override
    public void execute() {
        System.out.println(name);
    }

    @Override
    public void undo() {
        System.out.println(name);
    }
}
