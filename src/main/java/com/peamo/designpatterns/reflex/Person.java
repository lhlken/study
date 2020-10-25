package com.peamo.designpatterns.reflex;

import java.io.Serializable;

/**
 * @author hwalong
 * @date 2018/9/22
 */
public class Person implements Serializable,Cloneable {

    private String name;

    private int age;

    public String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
