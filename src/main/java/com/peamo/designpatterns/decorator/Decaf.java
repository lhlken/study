package com.peamo.designpatterns.decorator;

/**
 * @author hwalong
 * @date 2018/8/23
 */
public class Decaf extends Beverage {
    @Override
    public String getDescription() {
        return "decaf";
    }

    @Override
    public float getCost() {
        return 0;
    }
}
