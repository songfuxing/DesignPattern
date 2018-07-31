package com.songfuxing.patterns.order;

/**
 * 命令接口
 */
public interface Command {
    public void execute();
    public void undo();
}
