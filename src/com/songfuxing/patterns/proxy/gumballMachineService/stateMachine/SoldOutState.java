package com.songfuxing.patterns.proxy.gumballMachineService.stateMachine;

/**
 * 具体的状态实现，处理来自context类的请求
 */
public class SoldOutState implements State {

    GumballMachineService gumballMachine;

    public SoldOutState(GumballMachineService gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        // 此状态不存在这种操
        System.out.println("SoldOutState, No insertQuarter");
    }

    @Override
    public void ejectQuarter() {
        // 此状态不存在这种操
        System.out.println("SoldOutState, No ejectQuarter");
    }

    @Override
    public void turnCrank() {
        // 此状态不存在这种操
        System.out.println("SoldOutState, No turnCrank");
    }

    @Override
    public void dispense() {
        // 此状态不存在这种操
        System.out.println("SoldOutState, No dispense");
    }
}
