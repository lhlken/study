package com.peamo.designpatterns.decorator;

/**
 * @author hwalong
 * @date 2018/8/23
 */
public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "soy "+super.getBeverage().getDescription();
    }

    @Override
    public float getCost() {
        return 1.1f+super.getBeverage().getCost();
    }
}
