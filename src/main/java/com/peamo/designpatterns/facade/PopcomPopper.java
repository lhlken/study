package com.peamo.designpatterns.facade;

/**
 * @author hualong.li
 * @date 2018/8/30
 */
public class PopcomPopper {

    public void on() {
        System.out.println("爆米花开启");
    }

    public void off() {
        System.out.println("爆米花关闭");
    }

    public void pop() {
        System.out.println("开始爆米花");
    }
}
