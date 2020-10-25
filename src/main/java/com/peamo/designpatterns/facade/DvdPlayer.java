package com.peamo.designpatterns.facade;

/**
 * @author hwalong
 * @date 2018/8/30
 */
public class DvdPlayer {

    public void on() {
        System.out.println("DVD开启");
    }

    public void off() {
        System.out.println("DVD关闭");
    }

    public void play(String name) {
        System.out.println("DVD 播放..."+name);
    }

}
