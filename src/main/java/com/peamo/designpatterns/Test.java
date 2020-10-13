package com.peamo.designpatterns;

/**
 *
 */


/**
 *
 */
public class Test {

    public static void main(String[] args) {
        long a = 1L;
        a |= 0x1 << 2;

        System.out.println(0x1);
        System.out.println(0x1 << 1);
        System.out.println(1 << 1);
        System.out.println("==============");
        long b1 = System.currentTimeMillis();
        for(int i = 0;i<100000000;i++) {
            int t = 0x1 << 30;
        }

        long b2 = System.currentTimeMillis();
        for(int i = 0;i<100000000;i++) {
            int t = 1 << 30;
        }

        long b3 = System.currentTimeMillis();

        System.out.println(b2-b1);
        System.out.println(b3-b2);
    }
}
