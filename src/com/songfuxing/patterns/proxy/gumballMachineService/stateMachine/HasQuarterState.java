package com.songfuxing.patterns.proxy.gumballMachineService.stateMachine;

import java.util.Random;

/**
 * 具体的状态实现，处理来自context类的请求
 */
public class HasQuarterState implements State {
    GumballMachineService gumballMachine;
    Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachineService gumballMachine) {
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
        // 下一个状态:  赢家或者普通状态
        int winner = random.nextInt(10);
        System.out.println("you get :" + winner);
        if (winner < 5 && gumballMachine.count > 1) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        // 此状态不存在这种操
        System.out.println("No gumball dispend");
    }
}
