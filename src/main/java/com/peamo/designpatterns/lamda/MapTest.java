package com.peamo.designpatterns.lamda;

import java.util.Arrays;
//import java.util.stream.Stream;

public class MapTest {

    public static void main(String[] args) {
//        String[] s1 = "Hello Complile Two Side Serer".split(" ");
//
//        Arrays.stream(s1).map((s2) -> {return s2.toUpperCase();}).forEach(System.out::println);
//
//        Stream<String> s3 = Stream.of("mike,4","lily,5","polly,6");
//        s3.map((s4) -> {int index = s4.indexOf(",");return new Person(s4.substring(0,index),Integer.valueOf(s4.substring(index+1)));}).forEach(System.out::println);

    }


}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person:name"+name+",age:"+age;
    }
}
