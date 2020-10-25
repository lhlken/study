package com.peamo.designpatterns.decorator;

/**
 * @author hwalong
 * @date 2018/8/23
 */
public class Milk extends CondimentDecorator {


    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "milk "+super.getBeverage().getDescription();
    }

    @Override
    public float getCost() {
        return 3.4f+super.getBeverage().getCost();
    }
}
