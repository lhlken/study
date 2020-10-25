package com.peamo.designpatterns.abstractfactory;

/**
 * @author hwalong
 * @date 2018/8/24
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Clams createClams() {
        return new FrozenClams();
    }
}
