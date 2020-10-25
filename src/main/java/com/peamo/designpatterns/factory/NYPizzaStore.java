package com.peamo.designpatterns.factory;

/**
 * @author hwalong
 * @date 2018/8/24
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheesePizza".equals(type)) {
            pizza = new NYCheesePizza();
            return pizza;
        }
        return pizza;
    }
}
