package com.songfuxing.patterns.proxy.rmi;

import java.rmi.Naming;

/**
 * 客户端代码
 */
public class MyRemoteClient {

    public static void main(String[] args) {
        new MyRemoteClient().go();
    }

    public void go() {
        try {
            // lookup 方法访问RMI registry 拿到stub(客户端辅助类)
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/RemoteHello");
            String result = service.sayHello();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
