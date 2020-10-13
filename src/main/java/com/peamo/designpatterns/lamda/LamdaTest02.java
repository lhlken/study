package com.peamo.designpatterns.lamda;

import java.util.Arrays;

public class LamdaTest02 {

    public static void main(String[] args) {

        String[] ms = new String[]{"s1","s2","s3","s4"};
//        Arrays.sort(ms,StandBy::ss);
        System.out.println(Arrays.toString(ms));

    }
}

class StandBy {

    public static int ss(String str1,String str2) {
        return -str1.compareTo(str2);
    }
}
