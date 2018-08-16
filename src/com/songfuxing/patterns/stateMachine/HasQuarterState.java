package com.songfuxing.patterns.stateMachine;

/**
 * 具体的状态实现，处理来自context类的请求
 */
public class HasQuarterState implements State{
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        // 此状态不存在这种操作
        System.out.println("HasQuarterState, No insertQuarter! you have already insert quarter");
    }

    @Override
    public void ejectQuarter() {
        // 退钱
        System.out.println("eject Quarter");
        // 状态回退
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        // 转动开关
        System.out.println("turn crank success");
        // 下一个状态
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        // 此状态不存在这种操
        System.out.println("No gumball dispend");
    }
}
