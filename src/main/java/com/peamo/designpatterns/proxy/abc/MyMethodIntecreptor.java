package com.peamo.designpatterns.proxy.abc;

//import net.sf.cglib.proxy.MethodInterceptor;
//import net.sf.cglib.proxy.MethodProxy;
//
//import java.lang.reflect.Method;
//
//public class MyMethodIntecreptor implements MethodInterceptor {
//    @Override
//    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//
//        if("select".equals(method.getName())) {
//            System.out.println("start select --->" + objects[0]);
//
//            Object object = methodProxy.invokeSuper(o,objects);
////            Object object = method.invoke(o,objects);
//            System.out.println("end select --->" + objects[0]);
//            return object;
//        }else {
//            return methodProxy.invokeSuper(o,objects);
//        }
//    }
//}
