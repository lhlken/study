package com.peamo.designpatterns.abstractfactory;

/**
 * @author hualong.li
 * @date 2018/8/24
 */
public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);
}
