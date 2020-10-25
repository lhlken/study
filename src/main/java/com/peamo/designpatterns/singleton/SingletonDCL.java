package com.peamo.designpatterns.singleton;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @author hwalong
 * @date 2018/8/25
 */
public class SingletonDCL {

    private static SingletonDCL singletonDCL = null;

    private volatile int count = 1;

    public static SingletonDCL getInstance() {
        if(singletonDCL == null) {
            synchronized (SingletonDCL.class) {
                if(singletonDCL == null) {
                    singletonDCL = new SingletonDCL();
                }
            }

        }
        return  singletonDCL;
    }

    public void add() {
        System.out.println(this.toString() +"============="+ (count++));
    }

}
