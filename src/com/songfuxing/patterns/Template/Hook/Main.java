package com.songfuxing.patterns.Template.Hook;


/**
 * 钩子函数，让子类决定是否实现算法。
 * 模版中包含两种算法，一种是抽象算法，子类必须实现；另一种是子类可选的算法
 */
public class Main {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        myTea.prepareRecipe();
        // coffee有用户选择是否添加调料的权利, tea则使用了超类默认的 添加调料。
        Coffee myCoffee = new Coffee();
        myCoffee.prepareRecipe();
    }
}
