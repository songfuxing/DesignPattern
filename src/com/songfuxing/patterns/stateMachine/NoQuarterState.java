package com.songfuxing.patterns.stateMachine;

/**
 * 具体的状态实现，处理来自context类的请求
 */
public class NoQuarterState implements State{

    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        // 收钱
        System.out.println("You inserted a quarter");
        // 状态继续
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        // 此状态不存在这种操
        System.out.println("NoQuarterState, No ejectQuarter");
    }

    @Override
    public void turnCrank() {
        // 此状态不存在这种操
        System.out.println("NoQuarterState, No turnCrank");
    }

    @Override
    public void dispense() {
        // 此状态不存在这种操
        System.out.println("NoQuarterState, No dispense");
    }
}
