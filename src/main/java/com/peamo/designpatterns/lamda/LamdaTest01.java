package com.peamo.designpatterns.lamda;


import java.util.Arrays;
import java.util.Comparator;

public class LamdaTest01 {

    public static void main(String[] args) {
        String[] ss = new String[]{"s1","s2","s3","s4"};

//        Arrays.sort(ss, ( o1,  o2) -> {
//                return o1.compareTo(o2);
//            });

        System.out.println(Arrays.toString(ss));
    }
}
