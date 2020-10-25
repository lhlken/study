package com.peamo.designpatterns.annotation;

/**
 * @author hwalong
 * @date 2018/9/22
 */
public class Person {

    @NotNull("不要为空啊")
    private String name;

    private int id;

    public String getName() {
        return name;
    }

    public void setName(@NotNull String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
