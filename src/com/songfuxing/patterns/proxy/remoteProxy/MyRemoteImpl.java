package com.songfuxing.patterns.proxy.remoteProxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 远程接口的实现，基本使用jdk工具rmic.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    @Override
    public String sayHello() throws RemoteException {
        return null;
    }

    // 超类UnicastRemoteObject构造器申明了异常，所以此处需要继续抛出异常
    public MyRemoteImpl() throws RemoteException { }

    public static void main(String[] args) {
        try {
            // 继承UnicastRemoteObject，包含了stub和skelete的实现
            MyRemote service = new MyRemoteImpl();
            // 将产生的远程对象绑定到remiregistry中
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
