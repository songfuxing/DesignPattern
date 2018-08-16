package com.songfuxing.patterns.stateMachine;

/**
 * 所有状态的接口集合
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}
