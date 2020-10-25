package com.peamo.designpatterns.singleton;

/**
 * @author hwalong
 * @date 2018/8/25
 */
public class SingletonStaticHolder {

    private volatile int count;

    private static class SingletonHolder {
        private static SingletonStaticHolder singleton = new SingletonStaticHolder();
    }

    private SingletonStaticHolder() {

    }

    public static SingletonStaticHolder getInstance() {
        return SingletonHolder.singleton;
    }

    public void add() {
        System.out.println(this.toString() +"============="+ (count++));
    }
}
