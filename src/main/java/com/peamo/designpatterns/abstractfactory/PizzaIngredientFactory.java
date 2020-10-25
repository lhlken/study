package com.peamo.designpatterns.abstractfactory;

/**
 * @author hwalong
 * @date 2018/8/24
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Clams createClams();

}
