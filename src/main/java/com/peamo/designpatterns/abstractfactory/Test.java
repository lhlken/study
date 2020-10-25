package com.peamo.designpatterns.abstractfactory;

/**
 * @author hwalong
 * @date 2018/8/24
 */
public class Test {
    public static void main(String[] args) {
        PizzaStore ny = new NYPizzaStore();
        Pizza pizza = ny.createPizza("cheese");
        pizza.display();

        PizzaStore chicago = new ChicagoPizzaStore();
        Pizza pizza1 = chicago.createPizza("cheese");
        pizza1.display();
    }
}
