package com.peamo.designpatterns.singleton;

/**
 * @author hualong.li
 * @date 2018/8/25
 */
public class Singleton {

    private static Singleton singleton;

    private volatile int count = 1;

    private Singleton() {
    }

    public synchronized static Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void add() {
        System.out.println(this.toString() +"============="+ (count++));
    }
}
