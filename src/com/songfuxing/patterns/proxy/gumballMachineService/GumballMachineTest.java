package com.songfuxing.patterns.proxy.gumballMachineService;

import java.rmi.Naming;
import com.songfuxing.patterns.proxy.gumballMachineService.stateMachine.GumballMachineService;

/**
 * Created by songfuxing on 2018/8/17.
 */
public class GumballMachineTest {
    public static void main(String[] args) {
        GumballMachineService gumballMachineService = null;
        int count;

        try {
             count = 100;
            gumballMachineService = new GumballMachineService(count);
            Naming.rebind("/gumballmachine", gumballMachineService);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
