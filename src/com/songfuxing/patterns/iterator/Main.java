package com.songfuxing.patterns.iterator;

/**
 * 客户，点餐
 */
public class Main {
    public static void main(String[] args) {
        Waitress waitress = new Waitress(new BreakfastMenu(), new DinerMenu());
        waitress.printMenu();
    }
}
