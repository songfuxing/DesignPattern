package com.songfuxing.patterns.template.Hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by songfuxing on 2018/8/9.
 */
public abstract class CaffeineBeverage {
    // 这是我们的模版方法,申明为final防止子类覆盖，关注流程，把算法的具体实现申明为抽象，在子类中实现。
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
    }
    // 这些方法是子类必须提供的
    abstract void brew();
    abstract void addCondiments();
    // 这些方法是超类处理的，所有子类共享，也可以覆盖
    void boilWater() {
        System.out.println("Bolling water");
    }
    void pourInCup() {
        System.out.println("Pouring into Cups");
    }

    // 超类中提供的默认方法
    boolean customerWantCondiments() {
        return true;
    }

    protected String getUserInput() {
        String answer = null;
        System.out.println("Would you like condiments with your CaffeineBeverage?(y/n)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO Error");
        }
        if (answer == null) {
            return "n";
        }
        return answer;
    }
}
