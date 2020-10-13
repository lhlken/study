package com.peamo.designpatterns.adapter;

/**
 * @author hualong.li
 * @date 2018/8/29
 */
public class BlueDuck implements Duck {
    public void quack() {
        System.out.println("gua...gua...");
    }

    public void fly() {
        System.out.println("fly...fly...");
    }
}
