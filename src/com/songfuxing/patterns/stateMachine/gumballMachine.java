package com.songfuxing.patterns.stateMachine;

/**
 * 上下文Context类，拥有一些内部的状态，和一个当前状态，当客户调用context类的方法时，context类将会委托到当前状态去处理.
 */
public class GumballMachine {
    private State noQuarterState;
    private State soldOutState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    State state = soldOutState;
    int count;

    public GumballMachine(int count) {
        this.count = count;
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        if (count > 0) {
            this.state = noQuarterState;
        }
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        if (count != 0) {
            count --;
        }
    }

    // 每种状态的getter方法
    public State getSoldState() {
        return soldState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void print() {

    }
}
