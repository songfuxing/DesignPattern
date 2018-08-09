package com.songfuxing.patterns.Template.Hook;

/**
 * 子类，实现算法
 */
public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Coffee");
    }
    public void addCondiments() {
        System.out.println("Adding Sugar");
    }

    // 子类中覆盖该函数，不使用默认方法，让用户自己选择
    public boolean customerWantCondiments(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }
}
