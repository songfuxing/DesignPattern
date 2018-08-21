package com.songfuxing.patterns.proxy.protectProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by songfuxing on 2018/8/21.
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    PersonBean personBean;
    public NonOwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if (method.getName().equals("setHotOrNotRating")) {
                return method.invoke(personBean, args);
            } else if (method.getName().startsWith("set")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}
