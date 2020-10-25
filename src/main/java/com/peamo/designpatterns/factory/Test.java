package com.peamo.designpatterns.factory;

/**
 * @author hwalong
 * @date 2018/8/24
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizzaStorePizza = nyPizzaStore.createPizza("cheesePizza");
        nyPizzaStorePizza.display();

        PizzaStore chicagoPizzaStore = new ChicagoCheeseStore();
        Pizza chicagoCheesePizza = chicagoPizzaStore.createPizza("cheesePizza");
        chicagoCheesePizza.display();
    }
}
