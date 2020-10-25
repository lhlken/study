package com.peamo.designpatterns.abstractfactory;

/**
 * @author hwalong
 * @date 2018/8/24
 */
public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory chicago = new ChicagoPizzaIngredientFactory();
        if("cheese".equals(item)) {
            pizza = new ChicagoCheesePizza(chicago);
            return pizza;
        }
        return pizza;
    }
}
