package com.peamo.designpatterns.abstractfactory;

/**
 * @author hualong.li
 * @date 2018/8/24
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
