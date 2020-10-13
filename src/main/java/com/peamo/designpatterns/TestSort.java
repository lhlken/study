package com.peamo.designpatterns;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSort {
    public static void main(String[] args) {
        int size = 1000000000;
        List<Integer> a = new ArrayList(size);
        for(int i = 0;i<size;i++) {
            a.add((int)Math.random()*size);
        }

        long b1 = System.currentTimeMillis();
        Collections.sort(a);
        long b2 = System.currentTimeMillis();
        System.out.println(b2-b1);
        System.out.println(a.size());
    }
}