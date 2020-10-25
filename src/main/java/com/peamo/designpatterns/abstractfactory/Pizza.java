package com.peamo.designpatterns.abstractfactory;

/**
 * @author hwalong
 * @date 2018/8/24
 */
public abstract class Pizza {

    protected Dough dough;

    protected Sauce sauce;

    protected Cheese cheese;

    protected Clams clams;

    protected String description;

    public void display() {
        System.out.println(this.description);
    }

}
