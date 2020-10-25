package com.peamo.designpatterns.decorator;

/**
 * @author hwalong
 * @date 2018/8/23
 */
public abstract class CondimentDecorator extends Beverage {

    private Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }
}
