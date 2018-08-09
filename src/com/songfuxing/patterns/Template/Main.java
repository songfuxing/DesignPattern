package com.songfuxing.patterns.template;

/**
 * 模版方法，就是将算法的具体实现放到子类中
 */
public class Main {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();
        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }
}
