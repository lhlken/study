package com.peamo.designpatterns.factory;

/**
 * @author hualong.li
 * @date 2018/8/24
 */
public class ChicagoCheeseStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheesePizza".equals(type)) {
            pizza = new ChicagoCheesePizza();
            return pizza;
        }
        return pizza;
    }
}
