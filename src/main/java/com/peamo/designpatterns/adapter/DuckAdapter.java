package com.peamo.designpatterns.adapter;

/**
 * @author hualong.li
 * @date 2018/8/29
 */
public class DuckAdapter implements Duck {

    private Turkey turkey;

    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.fly();
    }
}
