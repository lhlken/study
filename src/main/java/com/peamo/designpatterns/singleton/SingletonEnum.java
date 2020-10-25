package com.peamo.designpatterns.singleton;

/**
 * @author hwalong
 * @date 2018/8/25
 */
public enum SingletonEnum {
    INSTANCE;

    private volatile int count = 1;

    public void add() {
        System.out.println(this.toString() +"============="+ (count++));
    }
}
