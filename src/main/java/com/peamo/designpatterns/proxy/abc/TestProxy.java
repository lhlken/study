package com.peamo.designpatterns.proxy.abc;

import com.peamo.designpatterns.proxy.UserService;
import com.peamo.designpatterns.proxy.UserServiceImpl;
//import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.Proxy;

public class TestProxy {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        System.out.println("============JDK --- start =============");
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userService);

        UserService jdkProxy = (UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(),UserServiceImpl.class.getInterfaces(),myInvocationHandler);

        System.out.println(jdkProxy.select("123"));
        System.out.println("================");
        jdkProxy.insert("abc");
        System.out.println("============JDK --- end =============");

        System.out.println("============CGLIB --- start =============");
//        MyMethodIntecreptor myMethodIntecreptor = new MyMethodIntecreptor();
//
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(UserServiceImpl.class);
//        enhancer.setCallback(myMethodIntecreptor);

//        UserService cgLibProxy = (UserService) enhancer.create();
//        System.out.println(cgLibProxy.select("123"));
//        System.out.println("================");
//        cgLibProxy.insert("abc");
//        System.out.println("============CGLIB --- end =============");



    }
}
