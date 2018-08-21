package com.songfuxing.patterns.proxy.protectProxy;

/**
 * Created by songfuxing on 2018/8/21.
 */
public class Main {
    public static void main(String[] args) {
        PersonBean joe = new PersonBeanImpl("Joe", "M", "meat", 1);
        PersonBean ownProxy = PersonProxyFactory.getOwnerProxy(joe);
        System.out.println(ownProxy.getName());
        System.out.println(ownProxy.getGender());
        try {
            ownProxy.setHotOrNotRating(3);
        } catch (Exception e) {
            System.out.println("ownProxy: You can not change hot");
        }


        PersonBean nonOwnProxy = PersonProxyFactory.getNonOwnerProxy(joe);
        System.out.println(nonOwnProxy.getName());
        System.out.println(nonOwnProxy.getGender());
        System.out.println(nonOwnProxy.getHotOrNotRating());
        nonOwnProxy.setHotOrNotRating(44);
        System.out.println(nonOwnProxy.getHotOrNotRating());
        try {
            nonOwnProxy.setGender("F");
        }catch (Exception e) {
            System.out.println("nonOwnProxy:You can not change gender");
        }
    }
}
