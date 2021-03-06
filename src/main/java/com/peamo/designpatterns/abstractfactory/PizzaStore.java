package com.peamo.designpatterns.abstractfactory;

/**
 * @author hwalong
 * @date 2018/8/24
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);
}
