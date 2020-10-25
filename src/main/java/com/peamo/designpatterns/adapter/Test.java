package com.peamo.designpatterns.adapter;

/**
 * @author hwalong
 * @date 2018/8/29
 */
public class Test {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();
        System.out.println("=====================");
        Duck duck = new DuckAdapter(turkey);
        duck.quack();
        duck.fly();
    }


}
