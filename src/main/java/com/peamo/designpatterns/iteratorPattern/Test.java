package com.peamo.designpatterns.iteratorPattern;

/**
 * @author hualong.li
 * @date 2018/9/1
 */
public class Test {
    public static void main(String[] args) {

        Waitress waitress = new Waitress(new DinerMenu(),new PancakeHouseMenu());

        waitress.printMenu();
    }
}
