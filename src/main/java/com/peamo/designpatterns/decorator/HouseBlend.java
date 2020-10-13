package com.peamo.designpatterns.decorator;

public class HouseBlend extends Beverage {

    @Override
    public String getDescription() {
        return "houseBlend";
    }


    @Override
    public float getCost() {
        return 3.5f;
    }
}
