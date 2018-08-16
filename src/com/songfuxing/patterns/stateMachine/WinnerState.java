package com.songfuxing.patterns.stateMachine;

/**
 * 新增一个状态
 */
public class WinnerState implements State{
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("WinnerState, No insertQuarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("WinnerState, No ejectQuarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("WinnerState, No turnCrank");
    }

    @Override
    public void dispense() {
        System.out.println("WinnerState, congratulation!");
        gumballMachine.releaseBall();
        if (gumballMachine.count == 0) {
            gumballMachine.releaseBall();
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.count > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }

    }
}
