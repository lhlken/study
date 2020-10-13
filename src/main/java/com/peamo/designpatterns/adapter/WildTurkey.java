package com.peamo.designpatterns.adapter;

/**
 * @author hualong.li
 * @date 2018/8/29
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("gobble...gol");
    }

    public void fly() {
        System.out.println("fly...");
    }
}
