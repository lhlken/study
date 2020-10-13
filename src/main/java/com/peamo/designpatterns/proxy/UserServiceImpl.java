package com.peamo.designpatterns.proxy;

public class UserServiceImpl implements UserService {
    @Override
    public String select(String name) {
        System.out.println("select--->"+name);
        return name+"select";
    }

    @Override
    public void insert(String name) {
        System.out.println("insert--->"+name);
    }
}
