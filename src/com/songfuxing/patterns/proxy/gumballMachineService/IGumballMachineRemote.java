package com.songfuxing.patterns.proxy.gumballMachineService;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.songfuxing.patterns.proxy.gumballMachineService.stateMachine.State;

/**
 * Created by songfuxing on 2018/8/17.
 */
public interface IGumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public State getState() throws RemoteException;
}
