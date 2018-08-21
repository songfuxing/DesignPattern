package com.songfuxing.patterns.proxy.protectProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 为personbean创建动态代理，该代理实现了对自身属性的开放以及对评分属性的保护
 * InvocationHandler实现了proxy中的方法，java负责创建proxy，proxy上的任何方法调用都会被传入InvocationHandler
 * 我们只需要在InvocationHandler中控制对realsubject的访问
 * 也就是说，只需要在InvocationHandler中实现personbean的方法控制
 */
public class OwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    // proxy方法被调用时，proxy会来调用此方法
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            // 如果是一个get方法，就直接调用personBean中的方法
            if (method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(personBean, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        // 其他的方法调用直接返回null
        return null;
    }
}
