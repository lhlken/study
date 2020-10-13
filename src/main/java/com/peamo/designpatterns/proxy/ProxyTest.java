package com.peamo.designpatterns.proxy;

//import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();

        MyInvocationHander handler = new MyInvocationHander();

        UserService jdkProxy = (UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(),new Class[]{UserService.class},handler);
        jdkProxy.select("aaa");



    }

    public void testJDK(int num) {
        Thread[] threads = new Thread[num];
        for(int i = 0;i<num;i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j = 0;j<1000000;j++ ) {
                        MyInvocationHander myInvocationHander = new MyInvocationHander();
                        UserService userService = (UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(),UserServiceImpl.class.getInterfaces(),myInvocationHander);
                        userService.select("aaa");
                    }
                }
            });
        }
    }

    public void testCglib(int num) {
        Thread[] threads = new Thread[num];
//        for(int i=0;i<num;i++) {
//            threads[i] = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    for(int j = 0;j<1000000;j++) {
//                        MyMethodIntecerptor myMethodIntecerptor = new MyMethodIntecerptor();
//                        Enhancer enhancer = new Enhancer();
//                        enhancer.setCallback(myMethodIntecerptor);
//                        enhancer.setSuperclass(UserServiceImpl.class);
//
//                        UserService cglibProxy = (UserService) enhancer.create();
//                        cglibProxy.select("bbb");
//                    }
//                }
//            });
//        }

        for(int i = 0;i<num;i++) {
            threads[i].start();
        }
    }
}
