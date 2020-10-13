package com.peamo.designpatterns.abstractfactory;

/**
 * @author hualong.li
 * @date 2018/8/24
 */
public class NYCheesePizza extends Pizza {

    public NYCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.cheese = pizzaIngredientFactory.createCheese();
        this.clams = pizzaIngredientFactory.createClams();
        this.dough = pizzaIngredientFactory.createDough();
        this.sauce = pizzaIngredientFactory.createSauce();
        this.description = "NYCheesePizza";
    }

}
