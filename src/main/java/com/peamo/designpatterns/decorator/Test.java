package com.peamo.designpatterns.decorator;

/**
 * @author hualong.li
 * @date 2018/8/23
 */
public class Test {
    public static void main(String[] args) {

      CondimentDecorator milk = new Milk(new Decaf());
      CondimentDecorator soy = new Soy(milk);

      System.out.println(soy.getDescription());
        System.out.println(soy.getCost());

    }
}
