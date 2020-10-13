package com.peamo.designpatterns.factory;

/**
 * @author hualong.li
 * @date 2018/8/24
 */
public class Pizza {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void display() {
        System.out.println(this.getDescription());
    }
}
