package com.peamo.designpatterns.abstractfactory;

/**
 * @author hualong.li
 * @date 2018/8/24
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.dough = pizzaIngredientFactory.createDough();
        this.clams = pizzaIngredientFactory.createClams();
        this.cheese = pizzaIngredientFactory.createCheese();
        this.sauce = pizzaIngredientFactory.createSauce();
        this.description = "ChicagoCheesePizza";
    }
}
