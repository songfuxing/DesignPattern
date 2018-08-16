package com.songfuxing.patterns.proxy.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程接口
 */
public interface MyRemote extends Remote{
    // 返回值：返回值类型必须是原语类型或者可序列化类型，如果是自己实现的对象，需要实现Serializable接口
    // 继承Remote：表示此接口要用来支持远程调用
    // 抛出异常： design for failure, 因为涉及到网络，每次调用都可能失败
    public String sayHello() throws RemoteException;

}
