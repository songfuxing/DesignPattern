package com.songfuxing.patterns.proxy.protectProxy;

import java.lang.reflect.Proxy;

/**
 * 实现一个创建proxy的静态类
 */
public class PersonProxyFactory {
    // 参数：被代理的对象
    // 返回值： 代理，因为代理和realsubject拥有同样的接口，这里我们返回personBean作为代理
    public static PersonBean getOwnerProxy(PersonBean personBean) {
        // 此方法创建代理
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new OwnerInvocationHandler(personBean));
    }

    public static PersonBean getNonOwnerProxy(PersonBean personBean) {
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(personBean));
    }

}
