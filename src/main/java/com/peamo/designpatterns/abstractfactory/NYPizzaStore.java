package com.peamo.designpatterns.abstractfactory;

/**
 * @author hwalong
 * @date 2018/8/24
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ny = new NYPizzaIngredientFactory();
        if("cheese".equals(item)) {
            pizza = new NYCheesePizza(ny);
            return pizza;
        }
        return pizza;
    }
}
