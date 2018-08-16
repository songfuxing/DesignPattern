package com.songfuxing.patterns.stateMachine;

/**
 * 具体的状态实现，处理来自context类的请求
 */
public class SoldState implements State{

    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        // 此状态不存在这种操
        System.out.println("SoldState, No insertQuarter");
    }

    @Override
    public void ejectQuarter() {
        // 此状态不存在这种操
        System.out.println("SoldState, No ejectQuarter");
    }

    @Override
    public void turnCrank() {
        // 此状态不存在这种操
        System.out.println("SoldState, No turnCrank");
    }

    @Override
    public void dispense() {
        // 出糖
        System.out.println("sale gumball success!");
        gumballMachine.releaseBall();
        // 状态转换
        if (gumballMachine.count > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
